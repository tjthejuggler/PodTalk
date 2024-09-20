// build.gradle.kts (Project level)
buildscript {
    extra["compose_version"] = "1.5.0"
    extra["kotlin_version"] = "1.8.10"
}

plugins {
    id("com.android.application") version "8.6.0" apply false
    id("com.android.library") version "8.6.0" apply false
    id("org.jetbrains.kotlin.android") version "1.8.10" apply false
}