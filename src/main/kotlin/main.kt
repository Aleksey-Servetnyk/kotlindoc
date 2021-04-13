import annotations.Ann
import annotations.Foo
import annotations.Foo3

fun main(args: Array<String>) {
    val foo = Foo()
    println(foo.baz(5))
    val foo3 = Foo3()
    println(foo3)


}