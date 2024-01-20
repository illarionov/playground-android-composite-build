package ru._0xdc.gradle.metaspace.test.util

import java.io.File
import org.gradle.testkit.runner.BuildResult
import org.gradle.testkit.runner.GradleRunner

object TestUtils {
    fun buildProject(
        projectName: String,
        projectDir: File,
    ): BuildResult {
        setupProject(projectName, projectDir)

        val runner = GradleRunner.create()
            .forwardOutput()
            .withArguments(
                "--stacktrace",
                "greeting",
                "assemble"
            )
            .withProjectDir(projectDir)
            .withGradleVersion("8.5")

        return runner.build()
    }

    fun setupProject(
        projectName: String,
        dstPath: File
    ) {
        Paths.testProjectsRoot.resolve(projectName).copyRecursively(dstPath)
        dstPath.resolve("settings.gradle.kts").let { settingsKtsFile ->
            val functionalTestsMaven = File(Paths.userDir, "../build/functional-tests-plugin-repository")
            val newContent = settingsKtsFile
                .readText()
                .replace("<<TEST_REPOSITORY>>", "file://$functionalTestsMaven")
            settingsKtsFile.writeText(newContent)
        }
        dstPath.resolve("local.properties").writeText("sdk.dir=${androidHome()}")
    }
}