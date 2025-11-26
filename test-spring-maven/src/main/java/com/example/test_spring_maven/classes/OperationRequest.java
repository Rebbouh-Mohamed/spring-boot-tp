package com.example.test_spring_maven;

public class OperationRequest {
     double a;  // Switch to private for better encapsulation
    double b;
     String operation;

    public OperationRequest() {}  // Explicit no-arg constructor

    // Getters and setters
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
}