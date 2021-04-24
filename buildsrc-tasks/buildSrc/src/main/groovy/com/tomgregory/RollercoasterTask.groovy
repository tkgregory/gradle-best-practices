package com.tomgregory

import org.gradle.api.DefaultTask
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.TaskAction

abstract class RollercoasterTask extends DefaultTask {
    @Input
    abstract Property<String> getFavouriteCoaster()

    RollercoasterTask() {
        favouriteCoaster.convention('Space mountain')
    }

    @TaskAction
    def tellMeMyFavourite() {
        println "Your favourite coaster is ${favouriteCoaster.get()}!"
    }
}
