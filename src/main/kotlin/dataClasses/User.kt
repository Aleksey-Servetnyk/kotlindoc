package dataClasses

data class User(val name: String, val age: Int)
data class UserNoConstructorParams(val name: String = "", val age: Int = 0)
