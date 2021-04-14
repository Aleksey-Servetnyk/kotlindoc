package scopeFunctions

data class Person(var name: String, var age: Int = 0, var city: String = "") {
    fun moveTo(newCity: String) {
        city = newCity
    }

    fun incrementAge() {
        age++
    }
}

fun applyBasic() {
    val adam = Person("Adam").apply {
        age = 32
        city = "London"
    }
    println(adam)
}

fun alsoBasic() {
    val numbers = mutableListOf("One", "Two", "Three")
    numbers
        .also { println("Elements of the list before adding new one: $it") }
        .add("Four")
}
