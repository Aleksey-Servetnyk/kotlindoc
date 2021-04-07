package controlInstructions

fun simpleFor() {
    val collection = listOf("One", "Two", "Three")
    for (item in collection)
        println(item)
}

fun indexArray() {
    val array = intArrayOf(1, 2, 3, 5)
    for (i in array.indices)
        println(array[i])

    for ((index, value) in array.withIndex()) {
        println("the element at $index is $value")
    }
}