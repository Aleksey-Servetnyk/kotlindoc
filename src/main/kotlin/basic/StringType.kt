package basic

fun printString(str: String) {
    for (ch in str) {
        println(ch)
    }
}

fun viewTemplate() {
    val i = 10
    println("i = $i")

    val s = "abc"
    println("$s.length is ${s.length}")
}