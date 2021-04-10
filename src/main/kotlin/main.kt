import dataClasses.Person
import dataClasses.User

fun main(args: Array<String>) {
    val person1 = Person("John")
    val person2 = Person("John")
    person1.age = 10
    person2.age = 20
    println("${person1 == person2}")

    val jack = User(name = "Jack", age = 1)
    val olderJack = jack.copy(age = 2)
    println(jack.toString())
    println(olderJack.toString())

    val jane = User("Jane", 35)
    val (name, age) = jane
    println("$name, $age years of age")
}

