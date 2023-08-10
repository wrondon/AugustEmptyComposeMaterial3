buildscript {
    repositories {
        google()
    }
    dependencies {
        val nav_version = "2.5.0"
        classpath ("androidx.navigation:navigation-safe-args-gradle-plugin:$nav_version")
        classpath ("com.google.dagger:hilt-android-gradle-plugin:2.45")
        classpath ("org.jetbrains.kotlin:kotlin-gradle-plugin:1.8.0")
    }
}
plugins {
    id ("com.android.application") version "8.0.2" apply false
    id ("com.android.library") version "8.0.2" apply false
    id ("org.jetbrains.kotlin.android") version "1.8.10" apply false
    id ("org.jetbrains.kotlin.jvm") version "1.8.10" apply false
    id ("com.google.android.libraries.mapsplatform.secrets-gradle-plugin") version "2.0.1" apply false
}
