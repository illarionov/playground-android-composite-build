import java.io.File

pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
    }

    if (File(rootDir, "gradle/plugin/project").exists()) {
        includeBuild("gradle/plugin/project") {
            name = "gradle-project-plugins"
        }
    }
    if (File(rootDir, "../project").exists()) {
        includeBuild("../project") {
            name = "gradle-project-plugins"
        }
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}
