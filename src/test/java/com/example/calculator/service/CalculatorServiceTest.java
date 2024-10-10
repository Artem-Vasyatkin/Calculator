package com.example.calculator.service;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    void add() {
        assertEquals("1 + 2 = 3", calculatorService.add(1, 2));
    }

    @Test
    void add_NullParameter() {
        assertThrows(IllegalArgumentException.class,
                () -> calculatorService.add(1, null));
    }

    @Test
    void subtract() {
        assertEquals("5 - 3 = 2", calculatorService.subtract(5, 3));
    }

    @Test
    void subtract_NullParameter() {
        assertThrows(IllegalArgumentException.class,
                () -> calculatorService.subtract(null, 2));
    }

    @Test
    void multiply() {
        assertEquals("4 * 5 = 20", calculatorService.multiply(4, 5));
    }

    @Test
    void multiply_NullParameter() {
        assertThrows(IllegalArgumentException.class,
                () -> calculatorService.multiply(4, null));
    }

    @Test
    void divide() {
        assertEquals("10 / 2 = 5.0", calculatorService.divide(10, 2));
    }

    @Test
    void divide_ByZero() {
        assertThrows(IllegalArgumentException.class,
                () -> calculatorService.divide(10, 0));
    }

    @Test
    void divide_NullParameter() {
        assertThrows(IllegalArgumentException.class,
                () -> calculatorService.divide(null, 2));
    }

    @Test
    void getAdd() {
        assertEquals(3, CalculatorService.getAdd(1, 2));
    }

    @Test
    void getSubtract() {
        assertEquals(3, CalculatorService.getSubtract(5, 2));
    }

    @Test
    void getMultiply() {
        assertEquals(20, CalculatorService.getMultiply(4, 5));
    }

    @Test
    void getDivide() {
        assertEquals(5, CalculatorService.getDivide(10, 2));
    }

    @Test
    void getDivide_ByZero() {
        assertThrows(ArithmeticException.class,
                () -> CalculatorService.getDivide(10, 0));
    }
}

