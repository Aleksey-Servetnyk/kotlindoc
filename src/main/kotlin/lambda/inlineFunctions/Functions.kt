package lambda.inlineFunctions

import java.util.concurrent.locks.Lock
import javax.swing.tree.TreeNode

inline fun <T> lock(lock: Lock, body: () -> T): T {
    return body()
}

fun hasZero(ints: List<Int>): Boolean {
    ints.forEach {
        if (it == 0) return true
    }
    return false
}

fun <T> TreeNode.findParentOfType(clazz: Class<T>): T? {
    var p = parent
    while (p != null && !clazz.isInstance(p)) {
        p = p?.parent
    }
    @Suppress("UNCHECKED_CAST")
    return p as T
}

inline fun <reified T> TreeNode.findParentOfType1(): T? {
    var p = parent
    while (p != null && p !is T) {
        p = p?.parent
    }
    return p as T
}