import functions.asList
import functions.double
import functions.printHello

fun main(args: Array<String>) {
    println(double(2))
    println(1 shl 3)

    printHello("Alex")
    printHello(null)

    println(asList(1, 2, 3))

    val a = arrayOf(1, 2, 3)
    println(asList(-1, 0, *a, 4))
}

