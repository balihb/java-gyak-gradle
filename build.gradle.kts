plugins {
    base
    kotlin("jvm") version "1.8.22"
}

subprojects {
    // println(this.path)
    if (this.path.matches("^(:[^:]+){2}$".toRegex())) {
        // val proj = this
        apply(plugin = "java")
        //println("found " + this.path)
        repositories {
            mavenCentral()
        }

        dependencies {
            val testImplementation by configurations
            testImplementation("org.junit.jupiter:junit-jupiter:5.9.3")
            testImplementation("org.junit.platform:junit-platform-console-standalone:1.9.3")
            testImplementation(files("../../checkthat.jar"))
        }

        tasks.named<Test>("test") {
            useJUnitPlatform()
        }

        configure<SourceSetContainer> {
            getByName("test").java {
                setSrcDirs(listOf("."))
            }
        }
    }
}
dependencies {
    implementation(kotlin("stdlib-jdk8"))
}
repositories {
    mavenCentral()
}
kotlin {
    jvmToolchain(17)
}
