package nullSafety

fun letNull() {
    val listWithNull: List<String?> = listOf("A", null)
    for (item in listWithNull) {
        item?.let { println(it) }
        if (item != null) println(item) else println("nulll")
        val l = item ?: "null value"
        println(l)
    }
    //val aInt: Int
    val a: String = "test"
    val aInt: Int? = a as? Int
    println("aInt: $aInt")
    val nullableList: List<Int?> = listOf(1, 2, null, 4)
    println(nullableList)
    val intList: List<Int> = nullableList.filterNotNull()
    println(intList)
}

fun baz() {
    val b: String? = null
    val l = b!!.length
}

