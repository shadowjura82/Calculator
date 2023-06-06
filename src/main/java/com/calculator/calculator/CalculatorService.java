package com.calculator.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements CalculatorInterface {

    public String MainPage() {
        return "This is main Page";
    }

    public String Wellcome() {
        return "<h1>Добро пожаловать в калькулятор</h1>";
    }

    public String Plus(Integer num1, Integer num2) {
        return Integer.toString(num1) + " + " + Integer.toString(num2) + " = " + Integer.toString(num1 + num2);
    }

    public String Minus(Integer num1, Integer num2) {
        return Integer.toString(num1) + " - " + Integer.toString(num2) + " = " + Integer.toString(num1 - num2);
    }

    public String Multiply(Integer num1, Integer num2) {
        return Integer.toString(num1) + " * " + Integer.toString(num2) + " = " + Integer.toString(num1 * num2);
    }

    public String divide(Double num1, Double num2) {
        if (num2 == 0.0) {
            return "Деление на 0 невозможно";
        } else {
            return Double.toString(num1) + " / " + Double.toString(num2) + " = " + Double.toString(num1 / num2);
        }
    }
}
