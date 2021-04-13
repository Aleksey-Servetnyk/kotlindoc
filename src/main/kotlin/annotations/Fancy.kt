package annotations

import classes.Inject

@Target(AnnotationTarget.CLASS, AnnotationTarget.FUNCTION, AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.EXPRESSION)
@Retention(AnnotationRetention.SOURCE)
@MustBeDocumented
annotation class Fancy {
}

@Fancy class Foo {
    @Fancy fun baz(@Fancy foo: Int): Int {
        return (@Fancy foo)
    }
}

class Foo1 @Inject constructor(dependency: MyDependency) {}
class Foo2 {
    var x: MyDependency? = null
    @Inject set
}

annotation class Special(val why: String)
@Special("sample") class Foo3 {}