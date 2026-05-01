package com.pradeep;

public class Calculator {

    public int add(int a, int b) {
        int unusedValue = 100; // intentional code smell for SonarQube demo
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int divide(int a, int b) {
        return a / b; // no zero check, useful for discussion
    }
}
