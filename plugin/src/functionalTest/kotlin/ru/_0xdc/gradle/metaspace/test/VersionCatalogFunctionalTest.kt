package ru._0xdc.gradle.metaspace.test

import java.io.File
import org.junit.jupiter.api.io.TempDir
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import ru._0xdc.gradle.metaspace.test.util.TestUtils

class VersionCatalogFunctionalTest {
    @field:TempDir
    lateinit var projectDir: File

    @ParameterizedTest
    @MethodSource("invocationNumber")
    fun `test project with version catalog`(invocationNumber: Int) {
        val result = TestUtils.buildProject("android-app-versioncatalog", projectDir)
        assert(result.output.contains("BUILD SUCCESSFUL"))
    }

    private companion object {
        @JvmStatic
        fun invocationNumber(): List<Int> = (1..   30).toList()
    }
}