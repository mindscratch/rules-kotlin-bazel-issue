package foo;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;


public class FooTest {
    @Test
    public void testFoo() throws IOException {

        Assert.assertNotNull("test", new Foo().message());
    }
}

