pluginManagement {
    includeBuild("build-logic")
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "dawn"
rootProject.buildFileName = "build.gradle.kts"

include(":app")
include(":common:network")
include(":common:design-system")
include(":data:example")
include(":feature:example")
include(":domain:example")
