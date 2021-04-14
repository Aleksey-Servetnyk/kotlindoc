package typeSafetyBuilders

fun result(args: Array<String>) =
    html {
        head {
            title { +"XML coding with Kotlin" }
        }
        body {
            h1 { +"XML coding with Kotlin" }
            p { +"this format my be use as XML alternate" }
            a(href = "http://kotlinlang.ru") { +"Kotlin"}
            p {
                +"Немного"
                b {+"смешанного"}
                +"текста. Посмотрите наш"
                a(href = "http://kotlinlang.org") {+"перевод"}
                +"документации Kotlin."
            }
            p {+"немного текста"}
            p {
                for (arg in args) +arg
            }
        }
    }