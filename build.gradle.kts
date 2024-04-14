plugins {
    id("com.android.library") version "8.2.2" apply false
    id("org.jetbrains.dokka") version "1.9.20"
    id("org.jetbrains.kotlin.multiplatform") version "1.9.23" apply false
}

subprojects {
    apply(plugin = "org.jetbrains.dokka")
}
