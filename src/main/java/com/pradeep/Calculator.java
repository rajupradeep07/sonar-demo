package com.pradeep;

public class Calculator {

    public int add(int a, int b) {
        int unusedValue = 100; // intentional code smell for SonarQube demo
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int mod(int a, int b) {
        return a % b;
    }

    public int square(int a) {
        return a * a;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            return 0;  // basic fix
        }
    return a / b;
    }
}
