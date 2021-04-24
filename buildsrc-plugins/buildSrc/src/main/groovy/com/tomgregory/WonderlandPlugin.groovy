package com.tomgregory

import org.apache.tools.ant.filters.ReplaceTokens
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.tasks.Copy
import org.gradle.api.tasks.TaskProvider
import org.gradle.api.tasks.bundling.Zip

class WonderlandPlugin implements Plugin<Project> {
    void apply(Project project) {
        def extension = project.extensions.create('wonderland', WonderlandPluginExtension)

        TaskProvider copyQuoteTask = project.tasks.register('copyQuote', Copy) {
            from 'quote.txt'
            into "$project.buildDir/quotes"
            filter(ReplaceTokens, tokens: [CHARACTER: extension.characterName.get()])
        }

        project.tasks.register('zipQuote', Zip) {
            from "$project.buildDir/quotes"
            destinationDirectory = project.buildDir
            archiveFileName = 'quote.zip'
            dependsOn copyQuoteTask
        }
    }
}
