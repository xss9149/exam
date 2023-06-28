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

    @Test
    void addFactorial(){
        FactorialController controller = new FactorialController();
        int result = controller.caculateSum();
        assertEquals(result, 0);
    }

    @Test
    void addFactorialFlowTest(){
        FactorialController controller = new FactorialController();
        int result = controller.caculateSum();
        assertEquals(result, 0);
        result = controller.calculateFactorialValue(5);
        assertEquals(result, 120);
        result = controller.calculateFactorialValue(4);
        assertEquals(result, 24);
        result = controller.caculateSum();
        assertEquals(result, 144);
    }


}

