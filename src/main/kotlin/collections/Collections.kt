package collections

fun lists() {
    val numbers: MutableList<Int> = mutableListOf(1, 2, 3)
    val readOnlyView: List<Int> = numbers
    println(numbers)
    numbers.add(4)
    println(readOnlyView)
    println(readOnlyView.last())
}
