import org.jetbrains.compose.desktop.application.dsl.TargetFormat

plugins {
    kotlin("multiplatform")
    id("org.jetbrains.compose")
}

group = "com.taeyeon"
version = "1.0-SNAPSHOT"


@OptIn(org.jetbrains.compose.ExperimentalComposeLibrary::class)
@Suppress("OPT_IN_IS_NOT_ENABLED")
kotlin {
    jvm {
        jvmToolchain(11)
        withJava()
    }
    sourceSets {
        val jvmMain by getting {
            dependencies {
                implementation(project(":common"))
                implementation(compose.desktop.currentOs)

                implementation(compose.material3)
                implementation(compose.materialIconsExtended)
            }
        }
        val jvmTest by getting
    }
}

compose.desktop {
    application {
        mainClass = "MainKt"
        nativeDistributions {
            targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb)
            packageName = "Calculatro"
            packageVersion = "1.0.0"
        }
    }
}
