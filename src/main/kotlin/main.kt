import operatorOverloading.Counter
import operatorOverloading.Point
import operatorOverloading.unaryMinus

fun main(args: Array<String>) {
    val point = Point(10, 20)
    println(-point)

    val counter = Counter(7)
    println(counter.plus(3))
    println(counter.dayIndex)
}