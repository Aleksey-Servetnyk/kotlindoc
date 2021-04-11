package enumerations

import java.util.function.BinaryOperator
import java.util.function.IntBinaryOperator

enum class IntArithmetics : BinaryOperator<Int>, IntBinaryOperator {
    PLUS {
        override fun apply(t: Int, u: Int): Int = t + u
    },
    TIMES {
        override fun applyAsInt(t: Int, u: Int): Int = t * u
        override fun apply(t: Int, u: Int): Int = t + u
    };

    override fun applyAsInt(t: Int, u: Int): Int = apply(t, u)
}