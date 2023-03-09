plugins {
    `java-gradle-plugin`
    id("org.jetbrains.kotlin.jvm") version "1.8.10"
}

repositories {
    mavenCentral()
}

gradlePlugin {
    // Define the plugin
    val greeting by plugins.creating {
        id = "com.example.transformaction.greeting"
        implementationClass = "com.example.transformaction.TransformactionPlugin"
    }
}
