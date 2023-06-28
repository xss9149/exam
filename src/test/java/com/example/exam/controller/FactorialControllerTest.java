package com.example.exam.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialControllerTest {

    @Test
    void calculateFactorial() {
        FactorialController controller = new FactorialController();
        int result = controller.calculateFactorialValue(4);
        assertEquals(result, 24);
    }
}

