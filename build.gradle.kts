plugins {
    kotlin("multiplatform") version "2.1.20" // можно взять более новую с kotlinlang.org
}

repositories {
    mavenCentral()
}

kotlin {
    linuxX64 {
        binaries {
            executable {
                entryPoint = "main"
            }
        }
    }
}
