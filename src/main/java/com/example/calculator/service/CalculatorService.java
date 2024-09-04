package com.example.calculator.service;

import org.springframework.stereotype.Service;

@Service

public class CalculatorService {

    public String add(Integer num1, Integer num2) {
            if (num1 == null || num2 == null) {
                throw new IllegalArgumentException("Один из параметров не передан");
            }
            return num1 + " + " + num2 + " = " + (num1 + num2);
        }

        public String subtract(Integer num1, Integer num2) {
            if (num1 == null || num2 == null) {
                throw new IllegalArgumentException("Один из параметров не передан");
            }
            return num1 + " − " + num2 + " = " + (num1 - num2);
        }

        public String multiply(Integer num1, Integer num2) {
            if (num1 == null || num2 == null) {
                throw new IllegalArgumentException("Один из параметров не передан");
            }
            return num1 + " * " + num2 + " = " + (num1 * num2);
        }

        public String divide(Integer num1, Integer num2) {
            if (num2 == 0) {
                throw new IllegalArgumentException("Ошибка: деление на ноль невозможно!");
            } if (num1 == null || num2 == null) {
                throw new IllegalArgumentException("Один из параметров не передан");
            }
            return num1 + " / " + num2 + " = " + (double) num1 / num2;
        }

    public static int getAdd(int num, int num2) {
        return num + num2;
    }

    public static int getSubtract(int num, int num2) {
        return num - num2;
    }

    public static int getMultiply(int num, int num2) {
        return num * num2;
    }

    public static int getDivide(int num, int num2) {
        return num / num2;
    }

}

