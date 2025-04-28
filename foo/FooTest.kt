package foo

import org.junit.Assert
import org.junit.Test


class FooTest {
    @Test
    fun testFoo() {
        Assert.assertNotNull("test", Foo().message())
    }
}