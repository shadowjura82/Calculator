package com.calculator.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements CalculatorInterface {

    public String MainPage() {
        return "<h1>Добро пожаловать в калькулятор</h1>";
    }

    public String Wellcome() {
        return "<h1>Добро пожаловать в калькулятор</h1>";
    }

    public Integer Plus(Integer num1, Integer num2) {
        return num1 + num2;
    }

    public Integer Minus(Integer num1, Integer num2) {
        return num1 - num2;
    }

    public Integer Multiply(Integer num1, Integer num2) {
        return num1 * num2;
    }

    public Double divide(Double num1, Double num2) throws IllegalAccessException {
        if (num2 == 0.0) {
            throw new IllegalAccessException("Деление на 0 невозможно");
        } else {
            return num1 / num2;
        }
    }
}
