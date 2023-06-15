rootProject.name = "java-zh"

listOf(
        "bead25",
        "bead6",
        "zh-1-6"
).forEach { semester ->
    File(rootDir, semester).listFiles()?.filter { it.isDirectory }
            ?.forEach {
                include(":${semester}:${it.name}")
            }
}
