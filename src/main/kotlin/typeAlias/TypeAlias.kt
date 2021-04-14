package typeAlias

import java.io.File

fun foo(p: Predicate<Int>) = p(412)

typealias FileTable<K> = MutableMap<K, MutableList<File>>
typealias MyHandler = (Int, String, Any) -> Unit
typealias Predicate<T> = (T) -> Boolean

typealias AInner = A.Inner
typealias BInner = B.Inner