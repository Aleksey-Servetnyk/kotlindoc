import classes.*

fun main(args: Array<String>) {
    InitOrderDemo("Hello!")
    Constructors(1)
    //val dontCreate = DontCreateMe()

    /*
        Для создания экземпляра класса конструктор вызывается так, как если бы он был обычной функцией:
    */
    val invoice = Invoice()
    val customer = Customer("Joe Smith")

    println("Построение класса Derived1(\"hello\", \"world\")")
    val d = Derived1("hello", "world")

    FilledRectangle().draw()
    println(FilledRectangle().fillColor)

    FilledRectangleWithInner().Filler().drawAndFill()

    Square().draw()
}