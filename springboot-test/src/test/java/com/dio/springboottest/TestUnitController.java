package com.dio.springboottest;

import com.dio.springboottest.controller.TestController;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestUnitController {

    @Test
    public void testUnit() {
        TestController controller = new TestController();
        String result = controller.greeting("Caio");
        assertEquals("Welcome, Caio", result);
    }

}
