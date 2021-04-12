import lambda.higherOrderFunctions.fold
import lambda.html

fun main(args: Array<String>) {
    val items = listOf(1, 2, 3, 4)
    items.fold(0) { acc: Int, i: Int ->
        print("acc = $acc, i = $i, ")
        val result = acc + i
        println("result = $result")
        result
    }

    val joinedToString = items.fold("Elements:", { acc, i -> acc + " " + i })
    val product = items.fold(1, Int::times)
    println("joinedToString = $joinedToString")
    println("product = $product")

    val repeatFun: String.(Int) -> String = { times -> this.repeat(times) }
    val twoParameters: (String, Int) -> String = repeatFun

    fun runTransformation(f: (String, Int) -> String): String {
        return f("hello ", 3)
    }

    val result = runTransformation(repeatFun)
    println("result = $result")

    val stringPlus: (String, String) -> String = String::plus
    val intPlus: Int.(Int) -> Int = Int::plus
    println(stringPlus.invoke("<-", "->"))
    println(stringPlus("Hello, ", "world!"))
    println(intPlus.invoke(1, 1))
    println(intPlus(1, 2))
    println(2.intPlus(3))

    println(lambda.items.fold(1) { acc, e -> acc * e })

    val result1: List<Int> = lambda.items.filter { it > 1 }
    println(result1)

    println(items.filter {
        val shouldFilter = it > 2
        shouldFilter
    })

    println(items.filter {
        val shouldFilter = it > 2
        return@filter shouldFilter
    })

    println(items.filter {
        return@filter it > 2
    })

    val strings = listOf("One", "Two", "Three", "Seven")
    println(strings.filter { it.length <= 5 }.sortedBy { it }.map { it.toUpperCase() })

    strings.forEach {value -> println(value)}

    var sum = 0
    items.filter { it > 0 }.forEach {
        sum += it
    }
    println(sum)

    val sum1: Int.(Int) -> Int = {other -> plus(other)}
    val sum2 = fun Int.(other: Int): Int = this + other

    html { body() }
}