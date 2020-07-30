package com.cursor.rethrowing;

import java.io.IOException;

public class RethrowingMethod {

    public static void someMethod() throws IOException {
        someMethod2();
    }

    public static void someMethod2() throws IOException {
        throw new IOException("IOException has thrown from someMethod.");
    }
}
