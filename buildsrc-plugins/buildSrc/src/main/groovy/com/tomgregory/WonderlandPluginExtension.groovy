package com.tomgregory

import org.gradle.api.provider.Property

abstract class WonderlandPluginExtension {
    abstract Property<String> getCharacterName()
}
