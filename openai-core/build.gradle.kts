plugins {
    kotlin("multiplatform")
    kotlin("plugin.serialization")
    id("maven-publish")
    id("com.diffplug.spotless")
    id("org.jetbrains.dokka")
    id("build-support")
}

group = "com.github.cosmos-official" // 꼭 이 형태로!
version = "1.0.0"

kotlin {
    explicitApi()
    jvm()

    sourceSets {
        all {
            languageSettings.apply{
                optIn("kotlinx.serialization.ExperimentalSerializationApi")
            }
        }
        val commonMain by getting {
            dependencies {
                api(libs.kotlinx.io.core)
                api(libs.serialization.json)
                implementation(libs.serialization.core)
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test-common"))
                implementation(kotlin("test-annotations-common"))
            }
        }
        val jvmTest by getting {
            dependencies {
                implementation(kotlin("test-junit"))
            }
        }
    }
}

publishing {
    publications {
        withType<MavenPublication> {
            pom {
                name.set("openai-kotlin-core")
                description.set("customized core for openai-kotlin")
                url.set("https://github.com/cosmos-official/vingle-openai-core")
            }
        }
    }
}
