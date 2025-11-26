
package com.example.test_spring_maven;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArithmeticController5 {
    @Autowired
    private CalculatorService<Double> calculator;


    @PostMapping("/calculate5")
    public String calculate(@RequestBody OperationRequest request) {
        double result;
        try {
            switch (request.operation) {
                case "+":
                    result = calculator.add(request.a, request.b);
                    break;
                case "-":
                    result = calculator.subtract(request.a, request.b);
                    break;
                case "*":
                    result = calculator.multiply(request.a, request.b);
                    break;
                case "/":
                    result = calculator.divide(request.a, request.b);
                    break;
                default:
                    return "Erreur : Opération invalide. Utilisez +, -, * ou /.";
            }
            return "Le résultat de " + request.a + " " + request.operation + " " + request.b + " est : " + result;
        } catch (ArithmeticException e) {
            return "Erreur : " + e.getMessage();
        }
    }
}