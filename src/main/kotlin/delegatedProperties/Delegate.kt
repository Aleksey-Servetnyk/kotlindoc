package delegatedProperties

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class Delegate : ReadWriteProperty<Example, String> {
    override fun getValue(thisRef: Example, property: KProperty<*>): String {
        return "$thisRef, thanks for delegating for me the '${property.name}'"
    }

    override fun setValue(thisRef: Example, property: KProperty<*>, value: String) {
        println("$value was assigned to '${property.name} at $thisRef'")
    }

}
