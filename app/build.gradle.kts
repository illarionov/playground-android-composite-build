import kotlin.random.Random

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example"
    compileSdk = 35

    defaultConfig {
        minSdk = 28
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}

androidComponents {
    onVariants(selector().withBuildType("debug")) { variant ->
        val prefillDatabaseTask = tasks.register<PrepareAssetsTask>("${variant.name}PrepareAssets")
        variant.sources.assets?.addGeneratedSourceDirectory(
            prefillDatabaseTask,
            PrepareAssetsTask::outputDirectory
        )
    }
}

public abstract class PrepareAssetsTask : DefaultTask() {
    @get:OutputDirectory
    abstract val outputDirectory: DirectoryProperty

    @TaskAction
    fun execute() {
        val assetFile = outputDirectory.get().file("asset.data").asFile
        assetFile.delete()
        val random = Random(42)
        val bytes = ByteArray(1_000_000)
        assetFile.outputStream().use { outputStream ->
            repeat(1000) {
                random.nextBytes(bytes)
                outputStream.write(bytes)
            }
        }
    }
}

