package extensions

class D1 {
    fun bar(){
        println("D1: bar")
    }
}

class C1 {
    private fun baz() {
        println("C1: baz")
    }
    private fun D1.foo() {
        bar()
        baz()
    }
    fun caller(d: D1) {
        d.foo()
    }

    fun D1.foo1() {
        toString()
        this@C1.toString()
    }
}

open class E1 {

}

class E2 : E1() {

}

open class C2 {
    open fun E1.foo() {
        println("E1.foo in C2")
    }
    open fun E2.foo() {
        println("E2.foo in C2")
    }
    fun caller(e1: E1) {
        e1.foo()
    }
}

class C3 : C2() {
    override fun E1.foo() {
        println("E1.foo in C3")
    }
    override fun E2.foo() {
        println("E2.foo in C3")
    }
}
