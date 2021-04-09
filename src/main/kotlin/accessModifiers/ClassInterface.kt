package accessModifiers

/*
Для членов, объявленых в классе:

private означает видимость только внутри этого класса (включая его члены);
protected — то же самое, что и private + видимость в субклассах;
internal — любой клиент внутри модуля, который видит объявленный класс, видит и его internal члены;
public — любой клиент, который видит объявленный класс, видит его public члены.
Примечание для Java программистов: в Kotlin внешний класс не видит private члены своих вложенных классов.

Если вы переопределите protected член и явно не укажете его видимость, переопределённый элемент также будет иметь модификатор доступа protected.*/

open class Outer {
    private val a = 1
    protected open val b = 2
    internal val c = 3
    val d = 4

    protected class Nested {
        public val e: Int = 5
    }
}

class Subclass : Outer() {
    override val b: Int = 5
}

class Unrelated(o: Outer) {

}

