package extensions

fun MutableList<Int>.swap(index1: Int, index2: Int) {
    val tmp = this[index1]
    this[index1] = this[index2]
    this[index2] = tmp
}

fun <T> MutableList<T>.swapGeneric(index1: Int, index2: Int) {
    val tmp = this[index1]
    this[index1] = this[index2]
    this[index2] = tmp
}

open class C

class D : C()

fun C.foo() = "c"
fun D.foo() = "d"

fun printFoo(c: C) {
    println(c.foo())
}

class E {
    fun foo() {
        println("member")
    }
}

fun E.foo() {
    println("extension")
}

fun E.foo(i: Int) {
    println("extension")
}

fun Any?.toString(): String {
    if (this == null) return "null"
    return toString()
}