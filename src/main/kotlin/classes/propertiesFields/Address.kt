package classes.propertiesFields

public class Address constructor(val simple: Int? = 5) {
    public var name: String = "Alex"
    public var street: String = "Chapaeva"
    public var city: String = "Krasilov"
    public var state: String = "Chmelnitskiy"
    public var zip: String = "31000"

    var allByDefault: Int? = 1
    var initialized = 1

    val inferredType = 1

    val isEmpty: Boolean
        get() = this.zip == ""

    fun copyAddress(address: Address): Address {
        val result = Address()
        result.name = address.name
        result.street = address.street
        result.city = address.city
        result.state = address.state
        result.zip = address.zip
        return result
    }
}