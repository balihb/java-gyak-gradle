subprojects {
    val proj = this
    tasks.register<JavaExec>("runMain") {
        classpath = proj.the<JavaPluginExtension>().sourceSets["test"].runtimeClasspath
        mainClass.set("my.Main")
        args("one,two,three", "2nd")
    }
}
