import sealedClasses.Const
import sealedClasses.NotANumber
import sealedClasses.Sum
import sealedClasses.eval

fun main(args: Array<String>) {
    val c = Const(6.0)
    println(c.number)
    val s = Sum(c, c)
    println(s.toString())
    println(s)

    println(eval(s))
    println(eval(c))
    println(eval(NotANumber))
}

