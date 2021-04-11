import nestedClasses.Outer

fun main(args: Array<String>) {
    println(Outer.Nested().foo())
    println(Outer().Inner().foo())
}

