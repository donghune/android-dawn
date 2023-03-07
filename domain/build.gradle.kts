plugins {
    id("dawn.android.library")
}

android {
    namespace = "io.github.dawn.domain"

    defaultConfig {
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
}

dependencies {
    implementation(project(":data"))
}
