package com.example.test_spring_maven;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceDoubleImpl implements CalculatorService<Double> {

    @Override
    public Double add(Double a, Double b) {
        return a + b;
    }

    @Override
    public Double subtract(Double a, Double b) {
        return a - b;
    }

    @Override
    public Double multiply(Double a, Double b) {
        return a * b;
    }

    @Override
    public Double divide(Double a, Double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division par zéro.");
        }
        return a / b;
    }
}