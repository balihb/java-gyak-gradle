subprojects {
    val proj = this
    tasks.register<JavaExec>("runMain") {
        classpath = proj.the<JavaPluginExtension>().sourceSets["test"].runtimeClasspath
        mainClass.set("linear.EquationSolver")
        args("2,1,-1,8", "-3,-1,2,-11", "-2,1,2,-3")
    }
}
