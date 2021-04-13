package annotations

annotation class Ann(val intValue: Int, val stringValue: String)

@Ann(1, "abc") class MyClass
