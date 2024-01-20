dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}

pluginManagement {
    repositories {
        exclusiveContent {
            forRepository {
                maven { url = uri("<<TEST_REPOSITORY>>") }
            }
            filter {
                includeGroupByRegex("""ru\._0xdc\.gradle\.metaspace\.test.*""")
            }
        }
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

include("app")
