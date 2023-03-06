plugins {
    id("dawn.android.library")
}

android {
    namespace = "io.github.dawn.data"

    defaultConfig {
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
}
