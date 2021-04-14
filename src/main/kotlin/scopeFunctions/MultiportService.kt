package scopeFunctions

class MultiportService(var url: String, var port: Int) {
    fun prepareRequest(): String = "Default request"
    fun query(request: String): String = "Request result: $request"
}

fun runFull() {
    val service = MultiportService("http://csk.kr.ua", 80)
    val result = service.run {
        port = 8080
        query(prepareRequest() + " port - $port")
    }
    val letResult = service.let {
        it.port = 8080
        it.query(it.prepareRequest() + " port - ${it.port}")
    }
    println(result)
    println(letResult)
}

fun runWithoutExtension() {
    val hexNumberRegex = run {
        val digits      = "0-9"
        val hexDigits   = "A-Fa-f"
        val sign        = "+-"
        Regex("[$sign]?[$digits$hexDigits]")
    }
    for (match in hexNumberRegex.findAll("+1234 -FFFF not-a-number")) {
        println(match.value)
    }
}