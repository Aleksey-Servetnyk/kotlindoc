package objects

import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent

/*window.addMouseListener(object : MouseAdapter() {
    override fun mouseClicked(e: MouseEvent?) {
        super.mouseClicked(e)
    }

    override fun mouseEntered(e: MouseEvent?) {
        super.mouseEntered(e)
    }
})*/

open class A(x: Int) {
    public open val y: Int = x
}

interface B {}

val ab: A = object : A(1), B {
    override val y = 15
}

val adHoc = object {
    var x: Int = 0
    var y: Int = 0
}



