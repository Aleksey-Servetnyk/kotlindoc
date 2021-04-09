import classes.*
import classes.propertiesFields.Address

fun main(args: Array<String>) {
    val address = Address()
    val result = Address().copyAddress(address)
    println("${result.name} ${result.street} ${result.city} ${result.state} ${result.zip}")


}