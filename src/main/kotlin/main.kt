import scopeFunctions.*

fun main(args: Array<String>) {
    Person("Alice", 29, "Amsterdam").let {
        println(it)
        it.moveTo("London")
        it.incrementAge()
        println(it)
    }
    val alice = Person("Catrin", 25, "Barselona")
    println(alice)
    alice.moveTo("Madrid")
    alice.incrementAge()
    println(alice)

    val str = "Hello"
    str.run { println("$length") }
    str.let { println("${it.length}") }

    val adam = Person("Adam").apply {
        age = 20
        city = "London"
    }
    println(adam)

    val i = getRandomInt()
    val i1 = getRandomInt1()

    sideSteps()
    lambdaResult()
    firstLast()

    letFunction()
    letFunction1()
    letNonNull()
    letLocalScope()

    withBasic()

    runFull()
    runWithoutExtension()

    applyBasic()

    alsoBasic()

    takeBasic()
    takeNullable()
    displaySubstringPosition("as;dlkf;mtfgdfkffkmv", "dfk")
    displaySubstringPosition("010000011", "12")
    displaySubstringPositionNotTake("as;dlkf;mtfgdfkffkmv", "dfk")
    displaySubstringPositionNotTake("010000011", "12")
}