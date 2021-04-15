package javaCompatibility.javaFromKotlin

import java.util.ArrayList

fun nonNull() {
    val list = ArrayList<String>()
    list.add("Item")
    val size = list.size
    val item = list[0]
    item.substring(1)
    val nullable: String? = item
    val notnull: String = item
}

