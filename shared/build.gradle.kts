import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget

plugins {
    kotlin("multiplatform")
    id("com.android.library")
    kotlin("plugin.serialization") version "1.5.20"
    //kotlin("native.cocoapods")
}

kotlin {
    android()

    val iosTarget: (String, KotlinNativeTarget.() -> Unit) -> KotlinNativeTarget =
        if (System.getenv("SDK_NAME")?.startsWith("iphoneos") == true)
            ::iosArm64
        else
            ::iosX64

    iosTarget("ios") {
        version = "1.0"
        binaries {
            framework {
                baseName = "shared"
                isStatic = true
                //embedBitcode(org.jetbrains.kotlin.gradle.plugin.mpp.BitcodeEmbeddingMode.BITCODE)
            }
        }
    }
//    iosX64{
//        version = "1.0"
//        binaries {
//            framework {
//                baseName = "shared"
//            }
//        }
//    }


//    cocoapods {
//        // Configure fields required by CocoaPods.
//        summary = "Some description for a Kotlin/Native module"
//        homepage = "Link to a Kotlin/Native module homepage"
////        pod("shared") {
////            version = "1.0"
////        }
//
//        // You can change the name of the produced framework.
//        // By default, it is the name of the Gradle project.
//        frameworkName = "shared"
//    }
    sourceSets {
        val commonMain by getting {dependencies {
            implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.2.2")
        }}
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test-common"))
                implementation(kotlin("test-annotations-common"))
            }
        }
        val androidMain by getting
        val androidTest by getting {
            dependencies {
                implementation(kotlin("test-junit"))
                implementation("junit:junit:4.13.2")
            }
        }
        val iosMain by getting
        val iosTest by getting
    }
}

android {
    compileSdkVersion(30)
    sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
    defaultConfig {
        minSdkVersion(16)
        targetSdkVersion(30)
    }
}