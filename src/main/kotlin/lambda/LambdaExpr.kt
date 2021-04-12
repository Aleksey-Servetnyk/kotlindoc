package lambda

val sum = { x: Int, y: Int -> x + y }
val sum1: (Int, Int) -> Int = { x, y -> x + y }

val items = listOf(1, 2, 3, 4)
val product = items.fold(1) { acc, e -> acc * e }

val result: List<Int> = items.filter { it > 1 }