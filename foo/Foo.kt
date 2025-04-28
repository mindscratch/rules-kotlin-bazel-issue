package foo

import org.acme.data.DataLibrary

class Foo {
    fun message(): String {
        return DataLibrary.getMessage()
    }
}
