import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.tasks.KotlinJvmCompile

plugins {
    alias(libs.plugins.multiplatform)
}

kotlin {
    jvm()
    linuxX64()

    sourceSets {
        all {
            languageSettings {
                languageVersion = "1.9"
                apiVersion = "1.9"
            }
        }
        commonMain.dependencies {
        }

        commonTest.dependencies {
            implementation(kotlin("test"))
        }

        jvmTest.dependencies {
            implementation("org.junit.jupiter:junit-jupiter:5.7.1")
            runtimeOnly("org.junit.platform:junit-platform-launcher")
        }
    }

    tasks.withType<Test> {
        useJUnitPlatform {

        }
        systemProperty("junit.jupiter.execution.parallel.enabled", "true")
        systemProperty("junit.jupiter.execution.parallel.mode.default", "concurrent")
        systemProperty("junit.jupiter.execution.parallel.config.strategy", "fixed")
        systemProperty("junit.jupiter.execution.parallel.config.fixed.parallelism", "4")
        maxParallelForks = 10
    }
}

tasks.withType<KotlinJvmCompile>().configureEach {
    compilerOptions {
        jvmTarget.set(JvmTarget.JVM_11)
    }
}

java {
    targetCompatibility = JavaVersion.VERSION_11
}
