package interfaces

interface MyInterface {
    val prop: Int

    val propertyWithImplementation: String
        get() = "foo"

    fun bar()
    fun foo() {
        print(prop)
    }
}

class Child : MyInterface {
    override val prop: Int = 29

    override fun bar() {
        TODO("Not yet implemented")
    }

}

interface A {
    fun foo() { print("A") }
    fun bar()
}

interface B {
    fun foo() { print("B") }
    fun bar() { print("bar") }
}

class C : A {
    override fun bar() {
        print("bar")
    }
}

class D : A, B {
    override fun foo() {
        super<A>.foo()
        super<B>.foo()
    }

    override fun bar() {
        super<B>.bar()
    }
}