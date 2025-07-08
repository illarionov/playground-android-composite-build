plugins {
    alias(libs.plugins.multiplatform)
}

kotlin {
    linuxX64()
    macosX64()
    macosArm64()

    sourceSets {
        commonTest.dependencies {
            implementation(kotlin("test"))
        }
    }
}
