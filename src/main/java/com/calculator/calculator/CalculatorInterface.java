package com.calculator.calculator;

public interface CalculatorInterface {
    String MainPage();

    String Wellcome();

    Integer Plus(Integer num1, Integer num2);

    Integer Minus(Integer num1, Integer num2);

    Integer Multiply(Integer num1, Integer num2);

    Double divide(Double num1, Double num2) throws IllegalAccessException;
}
