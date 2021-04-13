package intervals

fun printIntervals() {
    val i: Int = 2
    if (i in 1..10) { println(i) }

    for (x in 1..4) print(x)
    println()
    for (x in 4..1) print(x)
    println()
    for (x in 4 downTo 1) print(x)
    println()
    for (i in 1..4 step 2) print(i)
    println()
    for (i in 4 downTo 1 step 2) print(i)
    println()
    for (i in 1 until 10) print(i)
}