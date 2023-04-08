plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.taeyeon.groovyeval"
    compileSdkPreview = "UpsideDownCake"

    defaultConfig {
        applicationId = "com.taeyeon.groovyeval"
        minSdk = 29
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"
        multiDexEnabled = true

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
        isCoreLibraryDesugaringEnabled = true
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    dexOptions {
        jumboMode = true
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.3"
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
            excludes += "META-INF/INDEX.LIST"
            excludes += "META-INF/LICENSE.md"
            excludes += "META-INF/LICENSE-notice.md"
            excludes += "META-INF/groovy-release-info.properties"
            excludes += "META-INF/groovy/org.codehaus.groovy.runtime.ExtensionModule"
        }
    }
}

dependencies {
    coreLibraryDesugaring("com.android.tools:desugar_jdk_libs:2.0.3")

    implementation("org.codehaus.groovy:groovy:2.5.22")
    implementation("org.codehaus.groovy:groovy-all:2.5.22")
    implementation("org.ow2.asm:asm:9.5")
    //implementation("org.codehaus.groovy:groovy:3.0.17")
    //implementation("org.codehaus.groovy:groovy-all:3.0.17")
    //implementation("org.apache.groovy:groovy:4.0.11")
    //testImplementation(platform("org.apache.groovy:groovy-all:4.0.11"))

    implementation("androidx.core:core-ktx:1.10.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.1")
    implementation("androidx.activity:activity-compose:1.7.0")
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3")
    implementation(platform("androidx.compose:compose-bom:2023.01.00"))

    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
    androidTestImplementation(platform("androidx.compose:compose-bom:2023.01.00"))
    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")
}