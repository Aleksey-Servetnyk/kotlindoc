package lambda.functionalTypes

class IntTransformer : (Int) -> Int {
    override operator fun invoke(x: Int): Int = TODO()
}

val intFunction: (Int) -> Int = IntTransformer()
val a = { i: Int -> i + 1 }

