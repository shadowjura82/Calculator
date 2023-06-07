package com.calculator.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping (path = "/calculator")
@RestController
public class CalculatorController {
    private final CalculatorInterface calculatorService;

    public CalculatorController(CalculatorInterface calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String MainPage() {
        return calculatorService.MainPage();
    }

    @GetMapping(path = "/calculator")
    public String Wellcome() {
        return calculatorService.Wellcome();
    }

    @GetMapping(path = "/plus")
    public String Plus(@RequestParam Integer num1, @RequestParam Integer num2) {
        return calculatorService.Plus(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String Minus(@RequestParam Integer num1, @RequestParam Integer num2) {
        return calculatorService.Minus(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public String Multiply(@RequestParam Integer num1, @RequestParam Integer num2) {
        return calculatorService.Multiply(num1, num2);
    }

    @GetMapping(path = "/divide")
    public String divide(@RequestParam Double num1, @RequestParam Double num2) {
        return calculatorService.divide(num1, num2);
    }
}
