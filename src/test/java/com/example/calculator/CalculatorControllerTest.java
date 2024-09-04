package com.example.calculator;

import com.example.calculator.service.CalculatorService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorControllerTest {

    private final CalculatorController controller = new CalculatorController(new CalculatorService());

    @Test
    void getWelcome() {
        //test
        String actual = controller.getWelcome();
        //check
        assertEquals(actual, "Добро пожаловать в калькулятор");
    }

}