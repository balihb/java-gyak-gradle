tasks {
    named<JavaExec>("runMain") {
        setArgs(listOf("2,1,-1,8 -3,-1,2,-11 -2,1,2,-3"))
    }
}
