package controlInstructions
var max: Int = 0
const val a: Int = 5
const val b: Int = 7


fun ifInAction(): Int {
    if (a < b)
        max = b
    return max
}

fun ifElse(): Int {
    if (a > b)
        max = a
    else
        max = b
    return max
}

fun ifExp(): Int {
    max = if (a > b) a else b
    return max
}

fun ifMultiRows(): Int {
    return if (a > b) {
        println("return a")
        a
    } else {
        println("return b")
        b
    }
}