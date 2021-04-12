package delegatedProperties

import kotlin.properties.Delegates

class User {
    var name: String by Delegates.observable("<no name>") {
            _, old, new -> println("$old -> $new")
    }
}

class UserMap(val map: Map<String, Any?>) {
    val name: String    by map
    val age: Int        by map
}

class UserMutable(val map: MutableMap<String, Any?>) {
    var name: String    by map
    var age: Int        by map
}