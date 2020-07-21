plugins {
    java
}

group = "com.github.maly7"
version = "1.0.0"

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

repositories {
    jcenter()
}

dependencies {
    compileOnly("org.projectlombok:lombok:1.18.12")
    annotationProcessor("org.projectlombok:lombok:1.18.12")

    testImplementation("org.assertj:assertj-core:3.11.1")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.6.1")
}

tasks {
    test {
        useJUnitPlatform()
    }
}