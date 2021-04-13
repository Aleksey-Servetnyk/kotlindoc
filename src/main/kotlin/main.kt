import nullSafety.baz
import nullSafety.letNull

fun main(args: Array<String>) {
    var a: String = "abc"
    //a = null

    var b: String? = "abc"
    //b = null
    val l = b?.length

    val l1 = if (b != null && b.isNotEmpty()) {
        println("String of length ${b.length}")
    } else {
        println("Empty string")
    }

    letNull()

    baz()
}