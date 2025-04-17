plugins {
    kotlin("jvm") version "2.1.20"
    kotlin("plugin.spring") version "1.9.10"
    id("org.springframework.boot") version "3.1.5"
    id("io.spring.dependency-management") version "1.1.3"
}

group = "org.eclipse.thingweb.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven {
        url = uri("https://oss.sonatype.org/content/repositories/snapshots/")
    }
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter")
    implementation("org.springframework.boot:spring-boot-starter-web")

    implementation("org.jetbrains.kotlin:kotlin-stdlib")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core")

    implementation("org.eclipse.thingweb:kotlin-wot-binding-http:0.1.0-SNAPSHOT")
    implementation("org.eclipse.thingweb:kotlin-wot-spring-boot-starter:0.1.0-SNAPSHOT")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}

springBoot {
    mainClass.set("org.eclipse.thingweb.example.MainKt")
}