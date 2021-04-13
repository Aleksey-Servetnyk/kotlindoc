package multiDeclarations

data class Person(val name: String, val age: Int)

fun forDestruct() {
    val collection = listOf(Person("Bob", 25), Person("Janet", 30))
    for ((a, b) in collection) {
        println("$a $b")
    }
}

fun returnPerson(): Person {
    return Person("test", 5)
}



