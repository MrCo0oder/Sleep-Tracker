plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
//    id("com.google.devtools.ksp")
    id("androidx.navigation.safeargs")
    id("kotlin-parcelize")

}

android {
    namespace = "com.codebook.sleeptracker"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.codebook.sleeptracker"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        dataBinding = true
    }
}

ext {

}
dependencies {
    val version_coroutine = "1.3.7"
    val   version_lifecycle_extensions = "2.2.0"
    val   version_lifecycle = "2.2.0"
    val nav_version = "2.7.6"
    //noinspection GradleCompatible
    implementation("androidx.core:core-ktx:1.8.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    // Room and Lifecycle dependencies
    implementation ("androidx.room:room-runtime:2.6.1")
//    ksp ("androidx.room:room-compiler:2.2.5")
    implementation ("androidx.lifecycle:lifecycle-extensions:$version_lifecycle_extensions")

    // Coroutines
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-core:$version_coroutine")
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-android:$version_coroutine")

    // Navigation

    implementation("androidx.navigation:navigation-fragment-ktx:$nav_version")
    implementation("androidx.navigation:navigation-ui-ktx:$nav_version")

    // ViewModel and LiveData
    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:$version_lifecycle")

    // Kotlin Extensions and Coroutines support for Room
    implementation ("androidx.room:room-ktx:2.6.1")
}