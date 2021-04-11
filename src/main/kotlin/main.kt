import generics.*

fun main(args: Array<String>) {
    val box: Box<Int> = Box<Int>(1)
    val box1 = Box(2).also {
        println(box.value)
        println(it.value)
    }

    println(box.value)
    println(box1.value)

    println(nextT())


}

