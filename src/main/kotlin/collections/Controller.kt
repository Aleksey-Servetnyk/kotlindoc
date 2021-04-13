package collections

class Controller(items: MutableList<String>) {
    private val _items = items
    val items: List<String> get() = _items.toList()
}