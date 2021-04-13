import casting.*

fun main(args: Array<String>) {
    println(casting("test"))
    println(casting(12))
    demo(12)
    demo("test1")
    demo(intArrayOf(1, 2, 10, 20))

    val y: Int? = null
    val x: String? = y as String?
    val x1: String? = y as? String

    star(listOf("One", "Two"))
    star(listOf(1, 2))

    handleString(arrayListOf("Three", "Four"))

    val somePair: Pair<Any?, Any?> = "items" to listOf(1, 2, 3)
    val stringToInt = somePair.asPairOf<String, Int>()
    println(stringToInt)
    val stringToList = somePair.asPairOf<String, List<*>>()
    println(stringToList)
    val stringToStringList = somePair.asPairOf<String, List<String>>()
    println(stringToStringList)
}