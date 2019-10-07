plugins {
    kotlin("js") version "1.3.50"
}

group = "com.github.lamba92"
version = "1.0-SNAPSHOT"

kotlin {
    sourceSets["main"].dependencies {
        implementation(npm("firebase", "7.1.0"))
    }
}

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib-js"))
    implementation("com.soywiz.korlibs.klock:klock:1.7.3")
}

kotlin.target.browser { }