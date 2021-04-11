import delegation.BaseImpl
import delegation.Derived

fun main(args: Array<String>) {
    val b = BaseImpl(10)
    Derived(b).print()
}

