pluginManagement {
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

rootProject.name = "Common Lib bug"
includeBuild("commonlib")
includeBuild("build-logic")
include(":app")
