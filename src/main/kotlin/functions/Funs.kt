package functions

import kotlin.math.cos

fun double(x: Int): Int {
    return x + x
}

infix fun Int.shl(x: Int): Int = x * x

fun powerOf(number: Int, exponent: Int) {}

fun read(b: Array<Byte>, off: Int = 0, len: Int = b.size) {}

open class A {
    open fun foo(i: Int = 10) {}
}

class B : A() {
    override fun foo(i: Int) {
        super.foo(i)
    }
}

fun printHello(name: String?): Unit {
    if (name != null) println("Hello $name")
    else println("Hi there!")
}

fun <T> asList(vararg ts: T): List<T> {
    val  result = ArrayList<T>()
    for (t in ts)
        result.add(t)
    return result
}

tailrec fun findFixPoint(x: Double = 1.0): Double = if (x == cos(x)) x else findFixPoint((cos(x)))
private fun findFixPoint(): Double {
    var x: Double = 1.0
    while (true) {
        val y = cos(x)
        if (x == y) return y
        x = y
    }
}