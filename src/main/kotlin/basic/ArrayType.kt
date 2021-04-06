package basic

fun createArray(): Array<String> {
    return Array(5) { i -> (i * i).toString() }
}

fun sumOfIntArray(): Int {
    val x: IntArray = intArrayOf(1, 2, 3)
    return x[1] + x[2]
}