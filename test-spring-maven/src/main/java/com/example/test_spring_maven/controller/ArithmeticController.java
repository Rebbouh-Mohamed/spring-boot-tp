package com.example.test_spring_maven;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ArithmeticController {


    @PostMapping("/calculate")
    public String calculate(@RequestBody OperationRequest request) {
        double result;
        switch (request.operation) {
            case "+":
                result = request.a + request.b;
                break;
            case "-":
                result = request.a - request.b;
                break;
            case "*":
                result = request.a * request.b;
                break;
            case "/":
                if (request.b == 0) {
                    return "Erreur : Division par zéro.";
                }
                result = request.a / request.b;
                break;
            default:
                return "Erreur : Opération invalide. Utilisez +, -, * ou /.";
        }
        return "Le résultat de " + request.a + " " + request.operation + " " + request.b + " est : " + result;
    }
}