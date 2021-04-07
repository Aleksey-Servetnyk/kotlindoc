package controlInstructions

import java.lang.Integer.parseInt

fun simpleWhen(x: Int) {
    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> {
            print("x neither 1 nor 2")
        }
    }
}

fun commaWhen(x: Int) {
    when (x) {
        0, 1 -> println("x == 0 or x ==1")
        else -> println("otherwise")
    }
}

fun exprWhen(x: Int) {
    val s = "55"
    when (x) {
        parseInt(s) -> println("s encodes $x" )
        else -> println("s does not encodes $x")
    }
}

fun collectionWhen(x: Int) {
    val validNumbers = listOf(1 , 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12)
    when (x) {
        in 1..10 -> println("x is in the range")
        in validNumbers -> println("x is valid")
        !in 10..20 -> println("x is outside the range")
        else -> println("none of the above")
    }
}

fun typeWhen(x: String): Boolean {
    return when (x) {
        is String -> x.startsWith("prefix")
        else -> false
    }
}

