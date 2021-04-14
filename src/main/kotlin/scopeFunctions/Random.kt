package scopeFunctions

import kotlin.random.Random

fun writeToLog(message: String) {
    println("INFO: $message")
}

fun getRandomInt(): Int {
    return Random.nextInt(100).also {
        writeToLog("getRandomInt() method generated the value $it")
    }
}

fun getRandomInt1(): Int {
    return Random.nextInt(100).also { value ->
        writeToLog("getRandomInt() method generated the value $value")
    }
}

fun sideSteps() {
    val numberList = mutableListOf<Double>()
    numberList.also { println("Filling the list") }
        .apply {
            add(2.71)
            add(3.14)
            add(1.0)
        }
        .also { println("Sorting the list") }
        .sort()
    println(numberList)
}

fun lambdaResult() {
    val numbers = mutableListOf("one", "two", "three")
    val countEndWithE = numbers.run {
        add("four")
        add("five")
        count{ it.endsWith("e")}
    }
    println("$countEndWithE elements that e ended")
}

fun firstLast() {
    val numbers = mutableListOf("one", "two", "three")
    with(numbers) {
        val first = first()
        val last = last()
        println("first element: '$first' and last element: '$last'")
    }
}

fun letFunction() {
    val numbers = mutableListOf("one", "two", "three", "four", "five")
    numbers.map { it.length }.filter { it > 3 }.let {
        println(it)
    }
}

fun letFunction1() {
    val numbers = mutableListOf("one", "two", "three", "four", "five")
    numbers.map { it.length }.filter { it > 3 }.let(::println)
}

fun letNonNull() {
    val str: String? = "Hello"
    //processNonNullString(str)     // error: str may be null
    val length = str?.let {
        println("Call 'let()' for $it")
        processNonNullString(it)
        it.length
    }
}

fun processNonNullString(str: String) {}

fun letLocalScope() {
    val numbers = mutableListOf("one", "two", "three", "four", "five")
    val modifiedFirstItem = numbers.first().let { firstItem ->
        println("'$firstItem' is first element in the list")
        if (firstItem.length >= 5) firstItem else "" + firstItem + ""
    }.toUpperCase()
    println("'$modifiedFirstItem' is first element in the list after changes")
}

fun withBasic() {
    val numbers = mutableListOf("one", "two", "three", "four", "five")
    with(numbers) {
        println("'with' calling with $this argument")
        println("the list contain $size elements")
    }
    val firstAndLast = with(numbers) {
        "'${first()}' is first element in the list" +
                " '${last()}' is last element in the list"
    }
    println(firstAndLast)
}

fun takeBasic() {
    val number = Random.nextInt(100)
    println(number)
    val evenOrNull = number.takeIf { it % 2 == 0 }
    val oddOrNull = number.takeUnless { it % 2 == 0 }
    println("even: $evenOrNull, odd: $oddOrNull")
}

fun takeNullable() {
    val str = "Hello"
    val caps = str.takeIf { it.isNotEmpty() }?.toUpperCase()
    //val caps = str.takeIf { it.isNotEmpty() }.toUpperCase()
    println(caps)
}

fun displaySubstringPosition(input: String, sub: String) {
    input.indexOf(sub).takeIf { it >= 0 }?.let {
        println("Substring $sub is in $input")
        println("Start with $it index")
    }
}

fun displaySubstringPositionNotTake(input: String, sub: String) {
    val index = input.indexOf(sub)
    if (index >= 0) {
        println("Substring $sub is in $input")
        println("Start with $index index")
    }
}

