package annotations

@AnnWithArrayMethod(namrs = ["abc", "foo", "bar"]) class C3 {
    fun foo(ann: Ann) {
        val i = ann.intValue
    }
}