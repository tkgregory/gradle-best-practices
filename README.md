## buildsrc-tasks

Extract custom task implementations from the build script into *buildSrc*. This
promotes encapsulation and enables reuse across sub-projects.

## buildsrc-plugins

Extract common task declarations and `dependsOn` relationships into
a plugin in the *buildSrc* directory. This
promotes encapsulation and enables reuse across sub-projects.

## gradle-wrapper-example

Always use the Gradle wrapper. This ensures you're using the Gradle version
compatible with the project and allows others to build the project without
a local Gradle installation.