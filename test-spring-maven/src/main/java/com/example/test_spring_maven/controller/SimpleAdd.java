package com.example.test_spring_maven;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleAdd {

    @GetMapping("/add")
    public String add(@RequestParam int a, @RequestParam int b) {
        int sum = a + b;
        return "La somme de " + a + " et " + b + " est : " + sum;
    }
}