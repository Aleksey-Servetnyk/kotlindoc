import multiDeclarations.Person
import multiDeclarations.forDestruct
import multiDeclarations.returnPerson

fun main(args: Array<String>) {
    val person = Person("John", 30)
    val (name, age) = person
    println("$name $age")

    forDestruct()

    val (name1, age1) = returnPerson()
    println("$name1 $age1")

    val map1 = mapOf(1 to "1", 2 to "2")
    for ((key, value) in map1) {
        println("$key $value")
    }

}