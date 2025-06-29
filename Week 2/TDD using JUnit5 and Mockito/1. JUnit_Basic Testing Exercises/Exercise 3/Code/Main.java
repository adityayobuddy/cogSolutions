package com.example;

import com.example.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.add(10, 5);
        System.out.println("Result of addition: " + result);
    }
}
