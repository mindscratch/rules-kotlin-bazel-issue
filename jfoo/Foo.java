package foo;

import org.acme.data.DataLibrary;

import java.io.IOException;

public class Foo {

    public String message() throws IOException {
        return DataLibrary.getMessage();
    }
}
