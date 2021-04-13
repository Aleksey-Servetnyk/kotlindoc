import reflection.*
//import kotlin.reflect.jvm.*

fun main(args: Array<String>) {
    val c = MyClass::class
    println(c)

    val numbers = listOf(1, 2, 3)
    println(numbers.filter(::isOdd) )

    val predicate: (String) -> Boolean = ::isOdd
    println(predicate)

    val oddLength = compose(::isOdd, ::length)
    val strings = listOf("a", "ab", "abc")
    println(strings.filter(oddLength))

    println(::x.get())
    ::x.set(3)
    println(x)

    val strs = listOf("a", "ab", "abc")
    println(strs.map(String::length))

    val prop = A::p
    println(prop.get(A(1)))

    println(String::lastChar.get("abc").toUpperCase())

/*
    println(JA::p.javaGetter)
    println(JA::p.javaField)
*/

    val classKotlin = getKClass(String())
    println(classKotlin)

    val foo = function(::Foo)
    println(foo)

    println(regex1())

    val numberRegex = "\\d+".toRegex()
    val isNumber = numberRegex::matches
    println(isNumber("29"))

    val strings1 = listOf("abc", "1234", "a70")
    println(strings1.filter(numberRegex::matches))

    val isNumber1: (CharSequence) -> Boolean = numberRegex::matches
    println(isNumber1)
    val matches: (Regex, CharSequence) -> Boolean = Regex::matches
    println(matches)

    val prop1 = "abc"::length
    println(prop1.get())
}