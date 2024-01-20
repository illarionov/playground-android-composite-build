import org.gradle.api.tasks.testing.logging.TestLogEvent
import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.tasks.KotlinJvmCompile

plugins {
    `java-gradle-plugin`
    alias(libs.plugins.jvm)
    alias(libs.plugins.gradle.plugin.publish)
}

repositories {
    google()
    mavenCentral()
}

val functionalTestRepository = rootProject.layout.buildDirectory.dir("functional-tests-plugin-repository")

group = "ru._0xdc.gradle.metaspace.test"
version = "0.1-SNAPSHOT"

testing {
    suites {
        val functionalTest by registering(JvmTestSuite::class) {
            testType = "functional-test"
            useJUnitJupiter(libs.versions.junit5)

            dependencies {
                implementation(project())
            }
            targets {
                all {
                    testTask.configure {
                        jvmArgs = listOf(
                            "-XX:MaxMetaspaceSize=768M",
                            /**
                             * Uncomment to disable performance monitoring
                             */
                            // "-Dorg.gradle.daemon.performance.enable-monitoring=false"
                        )
                        testLogging {
                            events = setOf(
                                TestLogEvent.FAILED,
                                TestLogEvent.STARTED,
                                TestLogEvent.STANDARD_ERROR,
                                TestLogEvent.STANDARD_OUT,
                            )
                        }
                        javaLauncher = javaToolchains.launcherFor {
                            languageVersion = JavaLanguageVersion.of(17)
                        }
                        dependsOn(tasks.named("publishAllPublicationsToFunctionalTestsRepository"))
                        inputs.dir(functionalTestRepository)
                    }
                }
            }
        }
    }
}

dependencies {
    implementation(libs.agp.plugin.api)
    runtimeOnly(libs.agp.plugin)
}

publishing {
    repositories {
        maven {
            name = "functionalTests"
            url = uri(functionalTestRepository)
        }
    }
}

tasks.withType<KotlinJvmCompile>().configureEach {
    compilerOptions {
        jvmTarget = JvmTarget.JVM_17
        apiVersion = org.jetbrains.kotlin.gradle.dsl.KotlinVersion.KOTLIN_1_9
        languageVersion = org.jetbrains.kotlin.gradle.dsl.KotlinVersion.KOTLIN_1_9
    }
}

tasks.withType<JavaCompile>().configureEach {
    sourceCompatibility = JavaVersion.VERSION_17.toString()
}

gradlePlugin {
    val greeting by plugins.creating {
        id = "ru._0xdc.gradle.metaspace.test.greeting"
        implementationClass = "ru._0xdc.gradle.metaspace.test.GradleMetaspaceTestPlugin"
    }
    testSourceSets.add(sourceSets["functionalTest"])
}

tasks.clean {
    delete(functionalTestRepository)
}