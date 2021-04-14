package typeSafetyBuilders

import java.lang.StringBuilder

interface Element {
    fun render(builder: StringBuilder, indent: String)
}