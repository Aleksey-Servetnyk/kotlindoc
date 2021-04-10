import extensions.*

fun main(args: Array<String>) {
    val l = mutableListOf(1, 2, 3)
    println("${l[0]} ${l[2]}")
    l.swap(0, 2)
    println("${l[0]} ${l[2]}")

    println("${l[0]} ${l[2]}")
    l.swapGeneric(0, 2)
    println("${l[0]} ${l[2]}")

    val s = mutableListOf("One", "Two", "Three")
    println("${s[0]} ${s[2]}")
    s.swapGeneric(0, 2)
    println("${s[0]} ${s[2]}")

    printFoo(D())

    val e = E()
    e.foo()
    e.foo(1)

    var a = Any()
    a = "test"
    println(a.toString())

    val listString = listOf("One", "Two", "Three")
    println(listString.lastIndex)

    val c = C1()
    val d = D1()
    c.caller(d)

    C2().caller(E1())
    C3().caller(E1())
    C2().caller(E2())
}

