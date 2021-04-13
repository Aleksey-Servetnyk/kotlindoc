package reflection

class Foo

fun function(factory: () -> Foo) {
    val x : Foo = factory()
}