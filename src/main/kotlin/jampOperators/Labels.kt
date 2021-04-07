package jampOperators

fun labelForBreakContinue() {
    loop@ for (i in 1..100) {
        if (i > 3) break
        println("i == $i")
        for (j in 1..100) {
            println("j = $j")
            if (j > 3) break@loop
        }
    }
}

fun nonLocalReturn() {
    listOf(1, 2, 3).forEach {
        if (it == 4) return
        println(it)
    }
    println("this line is not reachable")
}

fun returnFromLambda() {
    listOf(1, 2, 3, 4, 5).forEach lit@ {
        if (it == 3) return@lit
        println(it)
    }
    println(" will be executed using an explicit label (lit@)")
}

fun returnFromLambdaWithImplicitLabel() {
    listOf(1, 2, 3, 4, 5).forEach {
        if (it == 3) return@forEach
        println(it)
    }
    println(" will be executed using an implicit label (forEach@)")
}

fun returnWithAnonymousFunction() {
    listOf(1, 2, 3, 4, 5).forEach (fun (value: Int) {
        if (value == 3) return
        println(value)
    })
    println(" will be executed using anonymous function")
}

fun breakSimulator() {
    run loop@{
        listOf(1, 2, 3, 4, 5).forEach {
            if (it == 3) return@loop
            println(it)
        }
    }
    println(" will be executed using the nested label")
}