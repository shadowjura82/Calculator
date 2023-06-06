package com.calculator.calculator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final CalculatorInterface calculatorService;

    public CalculatorController(CalculatorInterface calculatorService) {
        this.calculatorService = calculatorService;
    }

    @RequestMapping
    public String MainPage() {
        return calculatorService.MainPage();
    }

    @RequestMapping(path = "/calculator")
    public String Wellcome() {
        return calculatorService.Wellcome();
    }

    @RequestMapping(path = "/calculator/plus")
    public String Plus(@RequestParam Integer num1, @RequestParam Integer num2) {
        return calculatorService.Plus(num1, num2);
    }

    @RequestMapping(path = "/calculator/minus")
    public String Minus(@RequestParam Integer num1, @RequestParam Integer num2) {
        return calculatorService.Minus(num1, num2);
    }

    @RequestMapping(path = "/calculator/multiply")
    public String Multiply(@RequestParam Integer num1, @RequestParam Integer num2) {
        return calculatorService.Multiply(num1, num2);
    }

    @RequestMapping(path = "/calculator/divide")
    public String divide(@RequestParam Double num1, @RequestParam Double num2) {
        return calculatorService.divide(num1, num2);
    }
}
