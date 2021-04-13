package casting

fun casting(obj: Any): Int {
    return if (obj is String) obj.length
    else 0
}

fun demo(x: Any) {
    if (x is String) println(x.length)
    if (x !is String) return
    println(x.length)

    when (x) {
        is Int -> println(x + 1)
        is String -> x.length
        is IntArray -> println(x.sum())
    }
}

fun star(something: List<*>) {
    something.forEach { println(it) }
}

fun handleString(list: List<String>) {
    if (list is ArrayList) println(list)
}

inline fun <reified A, reified B> Pair<*, *>.asPairOf(): Pair<A, B>? {
    if (first !is A || second !is B) return null
    return first as A to second as B
}



