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
include(":domain")
include(":data")
include(":design_system")
