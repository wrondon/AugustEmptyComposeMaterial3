plugins {
    id ("com.android.application")
    id ("org.jetbrains.kotlin.android")
    id ("androidx.navigation.safeargs.kotlin")
    id ("com.google.devtools.ksp")
    id ("dagger.hilt.android.plugin")
    id ("org.jetbrains.kotlin.plugin.serialization") version "1.8.10"
}

android {
    namespace = "com.example.secondappmodule"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.secondappmodule"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation ("androidx.core:core-ktx:1.10.1")
    implementation ("androidx.lifecycle:lifecycle-runtime-ktx:2.6.1")
    implementation ("androidx.activity:activity-compose:1.7.2")

    val composeBom = platform("androidx.compose:compose-bom:2023.03.00")
    implementation(composeBom)
    androidTestImplementation(composeBom)

    implementation ("androidx.compose.ui:ui")
    implementation ("androidx.compose.ui:ui-graphics")
    implementation ("androidx.compose.ui:ui-tooling-preview")
    implementation ("androidx.compose.material3:material3")

    testImplementation ("junit:junit:4.13.2")
    androidTestImplementation ("androidx.test.ext:junit:1.1.5")
    androidTestImplementation ("androidx.test.espresso:espresso-core:3.5.1")

    androidTestImplementation ("androidx.compose.ui:ui-test-junit4")
    debugImplementation ("androidx.compose.ui:ui-tooling")
    debugImplementation ("androidx.compose.ui:ui-test-manifest")
//////////////
    implementation("com.google.dagger:hilt-android:2.47")
    ksp ("com.google.dagger:hilt-compiler:2.47")
    implementation( "org.jetbrains.kotlinx:kotlinx-serialization-json:1.5.1")

    /// Dec, 2022
    implementation( "androidx.activity:activity-compose:1.7.2")
    implementation( "androidx.appcompat:appcompat:1.6.1")
    implementation( "com.google.android.material:material:1.9.0")
    implementation( "androidx.constraintlayout:constraintlayout:2.1.4")


//    ////// COMPOSE ToolKit.
//    val compose_version = "1.3.1"
//    implementation( "androidx.compose.ui:ui:1.4.0")
//    // Tooling support (Previews, etc.)
//    implementation( "androidx.compose.ui:ui-tooling:1.4.0")
//    // Foundation (Border, Background, Box, Image, Scroll, shapes, animations, etc.)
//    implementation( "androidx.compose.foundation:foundation:1.4.0")
//    // Material Design
//    implementation( "androidx.compose.material:material:1.4.0")
//    // Material design icons
//    implementation( "androidx.compose.material:material-icons-core:1.4.0")
//    implementation( "androidx.compose.material:material-icons-extended:1.4.0")
//    // Integration with activities
//    implementation( "androidx.activity:activity-compose:1.7.0")
//    // Integration with ViewModels
//    implementation( "androidx.lifecycle:lifecycle-viewmodel-compose:2.6.1")
//    // Integration with observables
//    implementation( "androidx.compose.runtime:runtime-livedata:1.4.0")
//    implementation( "androidx.compose.runtime:runtime-rxjava2:1.4.0")


    ////// NAVIGATION - ALL (VIEWS, etc)

    // Kotlin
    implementation( "androidx.navigation:navigation-fragment-ktx:2.6.0")
    implementation( "androidx.navigation:navigation-ui-ktx:2.6.0")

    // Feature module Support
    implementation( "androidx.navigation:navigation-dynamic-features-fragment:2.6.0")

    // Testing Navigation
    androidTestImplementation ("androidx.navigation:navigation-testing:2.6.0")

    // Jetpack Compose Integration
    implementation( "androidx.navigation:navigation-compose:2.6.0")

    ///// Navigation DSL
    api ("androidx.navigation:navigation-fragment-ktx:2.6.0")

    ////// HILT-DAGGER
    implementation( "com.google.dagger:hilt-android:2.47")
    ksp ("com.google.dagger:hilt-compiler:2.47")
    implementation( "androidx.hilt:hilt-navigation-compose:1.0.0")

    ////// ROOM
    val room_version = "2.5.0"

    implementation( "androidx.room:room-runtime:2.5.2")
    implementation( "androidx.room:room-ktx:2.5.2")
    ksp ("androidx.room:room-compiler:2.5.2")

    // optional - RxJava2 support for Room
    implementation( "androidx.room:room-rxjava2:2.5.2")

    // optional - RxJava3 support for Room
    implementation( "androidx.room:room-rxjava3:2.5.2")

    // optional - Guava support for Room, including Optional and ListenableFuture
    implementation( "androidx.room:room-guava:2.5.2")

    // optional - Test helpers
    testImplementation ("androidx.room:room-testing:2.5.2")

    // optional - Paging 3 Integration
    implementation( "androidx.room:room-paging:2.5.2")

    ////// LIFECYCLE-VIEW-MODEL-LIVEDATA
    val lifecycle_version = "2.6.0-alpha05"
    val arch_version = "2.1.0"

    // ViewModel
    implementation( "androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.1")
    // ViewModel utilities for Compose
    implementation( "androidx.lifecycle:lifecycle-viewmodel-compose:2.6.1")
    // LiveData
    implementation( "androidx.lifecycle:lifecycle-livedata-ktx:2.6.1")
    // Lifecycles only (without ViewModel or LiveData)
    implementation( "androidx.lifecycle:lifecycle-runtime-ktx:2.6.1")

    // Saved state module for ViewModel
    implementation( "androidx.lifecycle:lifecycle-viewmodel-savedstate:2.6.1")

    // optional - helpers for implementing LifecycleOwner in a Service
    implementation( "androidx.lifecycle:lifecycle-service:2.6.1")

    // optional - ProcessLifecycleOwner provides a lifecycle for the whole application process
    implementation( "androidx.lifecycle:lifecycle-process:2.6.1")

    // optional - ReactiveStreams support for LiveData
    implementation( "androidx.lifecycle:lifecycle-reactivestreams-ktx:2.6.1")

    // optional - Test helpers for LiveData

    testImplementation ("androidx.arch.core:core-testing:2.2.0")

    ////// COROUTINES
    implementation( "org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")

    //////SPLASHSCREEN
    implementation( "androidx.core:core-splashscreen:1.0.1")

    implementation( "com.google.code.gson:gson:2.10.1")
    implementation( "com.squareup.retrofit2:converter-gson:2.9.0")
    implementation( "com.squareup.retrofit2:retrofit:2.9.0")

    ////////////-------------------------
    //// External Libraries
    implementation( "com.google.code.gson:gson:2.10.1")
    implementation( "com.github.bumptech.glide:glide:4.15.1")
    // Skip this if you don"t want to use integration libraries or configure Glide.
    /////////////////annotationProcessor "com.github.bumptech.glide:compiler:4.12.0"

    /////implementation( "com.squareup.picasso:picasso:2.71828"

    implementation( "com.squareup.retrofit2:retrofit:2.9.0")
    implementation( "com.squareup.retrofit2:converter-gson:2.9.0")
    implementation( "com.squareup.retrofit2:converter-moshi:2.9.0")

    implementation("com.squareup.moshi:moshi:1.15.0")
    implementation("com.squareup.moshi:moshi-kotlin:1.15.0")
    implementation("com.squareup.moshi:moshi-adapters:1.15.0")
    ksp("com.squareup.moshi:moshi-kotlin-codegen:1.14.0")

    ////okhttp
    ////implementation(("com.squareup.okhttp3:okhttp:4.9.3")
    ////testimplementation(("com.squareup.okhttp3:mockwebserver:4.9.3")

    ////okio
    ////implementation(("com.squareup.okio:okio:3.0.0")

    //// Acompaniest
    implementation( "com.google.accompanist:accompanist-insets:0.30.1")
    // If using insets-ui
    implementation( "com.google.accompanist:accompanist-insets-ui:0.30.1")
    implementation( "com.google.accompanist:accompanist-systemuicontroller:0.30.1")
    implementation( "com.google.accompanist:accompanist-appcompat-theme:0.30.1")
    implementation( "com.google.accompanist:accompanist-pager:0.30.1")

    // If using indicators, also depend on
    implementation( "com.google.accompanist:accompanist-pager-indicators:0.30.1")
    implementation( "com.google.accompanist:accompanist-swiperefresh:0.30.1")
    // If you"re using Material, use accompanist-placeholder-material
    implementation( "com.google.accompanist:accompanist-placeholder-material:0.30.1")
    // Otherwise use the foundation version
    implementation( "com.google.accompanist:accompanist-placeholder:0.30.1")
    implementation( "com.google.accompanist:accompanist-drawablepainter:0.30.1")
    implementation( "com.google.accompanist:accompanist-flowlayout:0.30.1")
    implementation( "com.google.accompanist:accompanist-permissions:0.30.1")
    implementation( "com.google.accompanist:accompanist-navigation-animation:0.30.1")
    implementation( "com.google.accompanist:accompanist-navigation-material:0.30.1")
    implementation( "com.google.accompanist:accompanist-webview:0.30.1")

    implementation("io.coil-kt:coil:2.4.0")
    implementation("io.coil-kt:coil-compose:2.4.0")

    implementation( "com.jakewharton.timber:timber:5.0.1")

    implementation( "io.reactivex.rxjava3:rxandroid:3.0.2")
    implementation( "io.reactivex.rxjava3:rxjava:3.1.6")
    implementation( "io.reactivex.rxjava3:rxkotlin:3.0.1")

    implementation( "org.jetbrains.kotlinx:kotlinx-serialization-json:1.5.1")

    implementation( "io.ktor:ktor-client-core:2.3.3")
    implementation( "io.ktor:ktor-client-cio:2.3.3")
    implementation( "io.ktor:ktor-client-content-negotiation:2.3.3")
    implementation( "io.ktor:ktor-serialization-kotlinx-json:2.3.3")
    implementation( "io.ktor:ktor-serialization-gson:2.3.3")

}