plugins {
    id("dawn.android.library")
    id("dawn.android.hilt")
}

android {
    namespace = "io.github.dawn.data"

    defaultConfig {
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
}

dependencies {
    implementation(libs.kotlinx.coroutines.android)
}
