package operatorOverloading

data class Point(val x: Int, val y: Int)

operator fun Point.unaryMinus() = Point(-x, -y)
