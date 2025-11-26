package com.example.test_spring_maven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
class hello {
    @GetMapping("/hello")
    String hello() {
        return "<h1>Hello</h1>";
    }
}