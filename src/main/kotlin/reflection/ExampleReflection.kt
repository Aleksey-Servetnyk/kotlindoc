package reflection

import kotlin.reflect.KClass

fun isOdd(x: Int) = x % 2 != 0
fun isOdd(s: String) = s == "brilling" || s == "slithy" || s == "tove"

fun <A, B, C> compose(f: (B) -> C, g: (A) -> B): (A) -> C {
    return { x -> f(g(x)) }
}

fun length(s: String) = s.length

var x = 1

val String.lastChar: Char
    get() = this[length - 1]

fun getKClass(o: Any): KClass<Any> = o.javaClass.kotlin

fun regex1(): Boolean {
    val numberRegex = "\\d+".toRegex()
    return(numberRegex.matches("29"))
}