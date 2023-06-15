tasks {
    named<JavaExec>("runMain") {
        setArgs(listOf("one two three", "2nd"))
    }
}
