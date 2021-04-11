package generics

abstract class Source<out T> {
    abstract fun nextT(): T
}

fun demo(strings: Source<String>) {
    val objects : Source<Any> = strings
}
fun nextT(): Any {
    return 15
}