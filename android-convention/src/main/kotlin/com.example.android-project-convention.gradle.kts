plugins {
    id("com.android.application")
}

android {
    compileSdkVersion(30)

    defaultConfig {
        applicationId("com.example.androidcomposite")
        minSdkVersion(23)
        targetSdkVersion(30)
        versionCode(1)
        versionName("1.0")
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}
