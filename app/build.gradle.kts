plugins {
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.apache.httpcomponents:httpcore:4.4.16")
}

application {
    mainClass = "org.example.App"
}
