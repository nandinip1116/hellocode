package com.codefirst1.hellocode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class HellocodeApplicationTests {

    @Test
    void sayHello_returnsHelloWorld() {
        HelloController controller = new HelloController();
        assertEquals("Hello, World!", controller.sayHello());
    }
}
