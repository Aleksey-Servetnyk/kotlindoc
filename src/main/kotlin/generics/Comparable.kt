package generics

abstract class Comparable<in T> {
    abstract fun compareTo(other: T): Int
}

fun demoComparable(x: Comparable<Number>) {
    println(x.compareTo(1.0))
    val y: Comparable<Double> = x
}