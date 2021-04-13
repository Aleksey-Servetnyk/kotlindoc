import collections.Controller
import collections.lists

fun main(args: Array<String>) {
    lists()

    val items = Controller(mutableListOf("One", "Two", "Three"))
    println(items.items)

    val numberItems = mutableListOf(1, 2, 3)
    println(numberItems.first())
    println(numberItems.last())
    println(numberItems.filter { it % 2 == 0 })
    if (numberItems.none {
            it > 6
        }) println("Do`t more six elements")
}