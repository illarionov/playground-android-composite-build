package ru._0xdc.gradle.metaspace.test.util

import java.io.File

object Paths {
    internal val userDir: String
        get() = System.getProperty("user.dir")
    internal val testProjectsRoot: File
        get() = File(userDir, "src/testProjects")

}