package com.example.calculator.service;

import org.assertj.core.api.NotThrownAssert;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Random;
import java.util.stream.Stream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatExceptionOfType;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    private final CalculatorService calculatorService = new CalculatorService();

    @ParameterizedTest
    @MethodSource("provideDifferentNumbers")
    void shouldReturnCorrectResult_WhenCorrectParams_ThenCorrectResultAdd(int num, int num2) {

        int expected = num + num2;

        //test
        int actual = CalculatorService.getAdd(num, num2);

        //check
        assertEquals(actual, expected);
    }

    private static Stream<Arguments> provideDifferentNumbers() {
        return Stream.of(Arguments.of(1, 1),
                Arguments.of(-10, 30),
                Arguments.of(1000, 1000));
    }


    @ParameterizedTest
    @MethodSource("provideDifferentNumbers2")
    void shouldReturnCorrectResult_WhenCorrectParams_ThenCorrectResultSub(int num, int num2) {

        int expected = num - num2;

        //test
        int actual = CalculatorService.getSubtract(num, num2);

        //check
        assertEquals(actual, expected);
    }

    private static Stream<Arguments> provideDifferentNumbers2() {
        return Stream.of(Arguments.of(1, 1),
                Arguments.of(-10, 30),
                Arguments.of(1000, 1000));
    }

    @ParameterizedTest
    @MethodSource("provideDifferentNumbers3")
    void shouldReturnCorrectResult_WhenCorrectParams_ThenCorrectResultMulti(int num, int num2) {

        int expected = num * num2;

        //test
        int actual = CalculatorService.getMultiply(num, num2);

        //check
        assertEquals(actual, expected);
    }

    private static Stream<Arguments> provideDifferentNumbers3() {
        return Stream.of(Arguments.of(1, 1),
                Arguments.of(-10, 30),
                Arguments.of(1000, 1000));
    }

    @ParameterizedTest
    @MethodSource("provideDifferentNumbers4")
    void shouldReturnCorrectResult_WhenCorrectParams_ThenCorrectResultDivide(int num, int num2) {

        int expected = num / num2;

        //test
        int actual = CalculatorService.getDivide(num, num2);

        //check
        assertEquals(actual, expected);
    }

    private static Stream<Arguments> provideDifferentNumbers4() {
        return Stream.of(Arguments.of(1, 1),
                Arguments.of(-10, 30),
                Arguments.of(1000, 1000));
    }
}