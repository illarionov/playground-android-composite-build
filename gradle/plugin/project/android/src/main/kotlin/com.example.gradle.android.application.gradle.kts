import com.android.build.api.dsl.ApplicationExtension

plugins {
    id("com.android.application")
    kotlin("android")
}

extensions.configure<ApplicationExtension>("android") {
    compileSdk = 33
    namespace = "com.example.compositebuild"

    defaultConfig {
        applicationId = "com.example.compositebuild"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

