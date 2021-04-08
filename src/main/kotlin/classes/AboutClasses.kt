package classes

import javax.naming.Context
import javax.swing.text.View

class Invoice {}
class Empty

class Person constructor(firstName: String)
class Person1 (firstName: String)

class InitOrderDemo(name: String) {
    val firstProperty = "First Property: $name".also(::println)

    init {
        println("First Init Block: $name")
    }

    val secondaryProperty = "Secondary Property: ${name.length}".also(::println)

    init {
        println("Secondary Init Block: ${name.length}")
    }

    val demoUpperCase = "name to upper case: ${name.toUpperCase()}".also(::println)
}

class PersonShortInit(val firstName: String, val lastName: String, var  age: Int)

class Customer public @Inject constructor(name: String) {}
annotation class Inject

class PersonWithSecondaryConstructors {
    var children: MutableList<PersonWithSecondaryConstructors> = mutableListOf()
    constructor(parent: PersonWithSecondaryConstructors) {
        parent.children.add(this)
    }
}

/*
Если у класса есть основной конструктор, каждый дополнительный конструктор должен прямо или косвенно ссылаться (через другой(ие)
конструктор(ы)) на основной. Осуществляется это при помощи ключевого слова this:
*/

class PersonAllConstructors(val name: String) {
    var children: MutableList<PersonAllConstructors> = mutableListOf()
    constructor(name: String, parent: PersonAllConstructors) : this(name) {
        parent.children.add(this)
    }

}

/*
Даже если у класса нет основного конструктора на него все равно происходит неявная ссылка и блоки инициализации выполняются также:
*/
class Constructors {
    init {
        println("Init Block")
    }
    constructor(i: Int) {
        println("Constructor")
    }
}

/*
Если вы не желаете иметь класс с открытым public конструктором, вам необходимо объявить пустой конструктор с соответствующим модификатором видимости:*/
class DontCreateMe private constructor() {}

// INHERITANCE
open class Base(p: Int)
class Derived(p: Int) : Base(p)

/*
Overriding Class Methods*/
open class Shape {
    open fun draw() {}
    fun fill() {}
}

class Circle() : Shape() {
    override fun draw() {
        super.draw()
    }
}

open class Rectangle() : Shape() {
    final override fun draw() {
        super.draw()
    }
}

/*
Overriding Class Properties*/
open class ShapeProperties {
    open val vertexCount: Int = 0
}

class RectangleProperties : ShapeProperties() {
    override val vertexCount: Int = 4
}

interface ShapeInterface {
    val vertexCount: Int
}

class RectangleInterface(override val vertexCount: Int = 4) : ShapeInterface
class Polygon : ShapeInterface {
    override val vertexCount: Int = 0
}

/*
Derived class initialization order
*/
open class Base1(val name: String) {
    init {
        println("Class initialization")
    }

    open val size: Int = name.length.also { println("Base1 Class Size Property initialization: $it") }
}

class Derived1(name: String, val lastName: String) : Base1(name.capitalize().also { println("Аргументы, переданные в конструктор класса Base1: $it") }) {
    init {
        println("Инициализация класса Derived1")
    }

    override val size: Int = (super.size + lastName.length).also { println("Инициализация свойства size в классе Derived1: $it") }
}

/*
Calling functions and properties of the superclass
*/
open class RectangleSuper {
    open fun draw() {
        println("Drawing a rectangle")
    }
    val borderColor: String get() = "black"

}

class FilledRectangle : RectangleSuper () {
    override fun draw() {
        super.draw()
        println("Filling a rectangle")
    }
    val fillColor: String get() = super.borderColor
}

class  FilledRectangleWithInner : RectangleSuper() {
    inner class Filler {
        fun fill() {}
        fun drawAndFill() {
            super@FilledRectangleWithInner.draw()
            println("The drawn rectangle filled ${super@FilledRectangleWithInner.borderColor} color")
        }
    }
}

// Overriding rules
open class RectangleOver {
    open fun draw() {
        println("Drawing a rectangle (overriding rules)")
    }
}

interface PolygonOver {
    fun draw() {
        println("Drawing a rectangle (overriding rules :: interface)")
    }
}

class Square() : RectangleOver(), PolygonOver {
    override fun draw() {
        super<RectangleOver>.draw()
        super<PolygonOver>.draw()
    }
}

// Abstract classes
open class Figure {
    open fun draw() {
        println("Drawing a figure")
    }
}

abstract class RectangleAbstract : Figure() {
    abstract override fun draw()
}