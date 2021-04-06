import basic.createArray
import basic.printString
import basic.sumOfIntArray
import basic.viewTemplate
import chars.decimalDigitValue

fun main(args: Array<String>) {

/*
    Вы можете использовать нижние подчеркивания, чтобы сделать числовые константы более читаемыми
*/
    val oneMillion = 1_000_000
    val creditCardNumber = 1234_5678_9012_3456L
    val hexBytes = 0xFF_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010

/*
    Обратите внимание, что использование обёрток для одного и того же числа не гарантирует равенства ссылок на них:
*/
    val a: Int = 10_000
    println(a === a)
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a
    println(boxedA === anotherBoxedA)
/*
    Однако, равенство по значению сохраняется:
*/
    println(boxedA == anotherBoxedA)

    val x = (1 shl 2) and 0x00_0F_F0_00
    println(x)

    println(decimalDigitValue('7'))

    val ar = createArray()
    for (str in ar) {
        println(str)
    }

    println(sumOfIntArray())

    printString("Test")

    println("Hello world\n")

    println("""
        for (c in "foo")
            print(c)
    """.trimIndent())

    viewTemplate()
}