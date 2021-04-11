import enumerations.IntArithmetics
import enumerations.RGB
import enumerations.printAllValues
import nestedClasses.Outer

fun main(args: Array<String>) {
    println(Outer.Nested().foo())
    println(Outer().Inner().foo())

    val a = 13
    val b = 31
    for (f in IntArithmetics.values()) {
        println("$f($a, $b) = ${f.apply(a, b)}")
        println("$f($a, $b) = ${f.applyAsInt(a, b)}")
    }

    printAllValues<RGB>()
}

