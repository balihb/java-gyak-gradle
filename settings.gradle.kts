rootProject.name = "java-zh"

listOf(
        "example_occasion"
).forEach { semester ->
    File(rootDir, semester).listFiles()?.filter { it.isDirectory }
            ?.forEach {
                include(":${semester}:${it.name}")
            }
}
