plugins {
    `kotlin-dsl`
}

group = "com.example.gradle.android"

kotlin {
    jvmToolchain(17)
}

dependencies {
    implementation("com.android.tools.build:gradle:8.2.0-alpha04")
    implementation("org.jetbrains.kotlin.jvm:org.jetbrains.kotlin.jvm.gradle.plugin:1.8.21")
}
