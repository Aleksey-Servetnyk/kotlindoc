import controlInstructions.*

fun main(args: Array<String>) {
    println(ifInAction())
    println(ifElse())
    println(ifExp())
    println(ifMultiRows())

    simpleWhen(1)
    simpleWhen(2)
    simpleWhen(5)

    commaWhen(1)
    commaWhen(5)

    exprWhen(55)

    collectionWhen(120)

    println(typeWhen("prefix1"))
    println(typeWhen("x_known"))

    println("--- for instruction ---")

    simpleFor()
    indexArray()
}