package generics

class Array<T>(val size: Int) {
    fun get(index: Int): T? {return null}
    fun set(index: Int, value: T) {}
}

/*
fun copy(from: Array<out Any>, to: Array<Any>) {
    assert(from.size == to.size)
    for (i in from.in) {
        to[i] = from[i]
    }
}*/
