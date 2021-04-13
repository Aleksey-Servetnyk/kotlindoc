package coroutines

import kotlinx.coroutines.*

fun firstCoroutine() {
    GlobalScope.launch {
        delay(1000L)
        println("World!")
    }
    println("Hello, ")
    Thread.sleep(2000L)
}

fun blockingCoroutine() {
    GlobalScope.launch {
        delay(1000L)
        println("World!")
    }
    println("Hello,")
    runBlocking {
        delay(2000L)
    }
}

fun runCoroutine() = runBlocking {
    GlobalScope.launch {
        delay(1000L)
        println("World!")
    }
    println("Hello,")
    delay(1000L)
}

fun jobCoroutine() = runBlocking {
    val job = GlobalScope.launch {
        delay(1000L)
        println("World!")
    }
    println("Hello,")
    job.join()
}

fun scopeCoroutine() = runBlocking {
    launch {
        doWorld()
    }
    println("Hello,")
}

suspend fun doWorld() {
    delay(1000L)
    println("World!")
}

fun scopeRunCoroutine() = runBlocking {
    launch {
        delay(200L)
        println("Task from runBlocking")
    }
    coroutineScope {
        launch {
            delay(500L)
            println("Task from nested launch")
        }

        delay(100L)
        println("Task from coroutine scope")
    }
    println("Coroutine scope is over")
}

fun manyCoroutines() = runBlocking {
    repeat(100_000) {
        launch {
            delay(5000L)
            print(".")
        }
    }
}

fun demonCoroutine() = runBlocking {
    GlobalScope.launch {
        repeat(1000) { i ->
            println("I`m sleeping $i ...")
            delay(500L)
        }
    }
    delay(1300L)
}