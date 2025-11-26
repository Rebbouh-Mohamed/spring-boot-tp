package com.example.test_spring_maven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
@RestController
class HelloPost {
    @PostMapping("/hellopost")
    String hello() {
        return "Hello post";
    }
}