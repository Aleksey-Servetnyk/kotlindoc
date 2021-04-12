import delegatedProperties.Example
import delegatedProperties.User
import delegatedProperties.UserMap
import delegatedProperties.UserMutable

fun main(args: Array<String>) {
    val e = Example()
    println(e.p)

    e.p = "NEW"

    val lazyValue: String by lazy {
        println("computed!")
        "Hello!"
    }
    println(lazyValue)
    println(lazyValue)

    val user = User()
    user.name = "first"
    user.name = "second"
    user.name = "three"

    val userMap = UserMap(mapOf(
        "name"  to "John Doe",
        "age"   to 25
    ))
    println(userMap.name)
    println(userMap.age)

    val userMutable = UserMutable(mutableMapOf(
        "name"  to "Catalina",
        "age"   to 30
    ))
    userMutable.age = 50
    println(userMutable.name)
    println(userMutable.age)
}

