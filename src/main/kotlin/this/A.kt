package `this`

class A {                   // implicit label @A
    inner class B {         // implicit label @B
        fun Int.foo() {     // implicit label @foo
            val a = this@A
            val b = this@B
            val c = this    // принимающий объект функции foo(), типа Int
            val c1 = this@foo    // принимающий объект функции foo(), типа Int

            val funLit = lambda@ fun String.() {
                val d = this    // принимающий объект литерала funLit
            }

            val funLit2 = { s: String -> val d1 = this } // принимающий объект функции foo(), т.к. замыкание лямбды не имеет принимающего объекта
        }
    }
}