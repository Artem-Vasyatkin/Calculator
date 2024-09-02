package com.example.calculator;


import com.example.calculator.service.CalculatorService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus")
    public String plus(@RequestParam(required = false) Integer num1,
                      @RequestParam(required = false) Integer num2) {
        validateParams(num1, num2);
        return calculatorService.add(num1, num2);
    }

    @GetMapping("/minus")
    public String minus(@RequestParam(required = false) Integer num1,
                           @RequestParam(required = false) Integer num2) {
        validateParams(num1, num2);
        return calculatorService.subtract(num1, num2);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam(required = false) Integer num1,
                           @RequestParam(required = false) Integer num2) {
        validateParams(num1, num2);
        return calculatorService.multiply(num1, num2);
    }

    @GetMapping("/divide")
    public String divide(@RequestParam(required = false) Integer num1,
                         @RequestParam(required = false) Integer num2) {
        validateParams(num1, num2);
        return calculatorService.divide(num1, num2);
    }

    private void validateParams(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException("Ошибка: оба параметра num1 и num2 должны быть указаны.");
        }
    }

    public String getWelcome() {
        return welcome();
    }

}
