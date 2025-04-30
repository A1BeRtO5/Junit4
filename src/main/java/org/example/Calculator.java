package org.example;

public class Calculator {
    public int add(int a, int b) {
        return a+b;
    }
    public int minus(int a, int b) {
        return a-b;
    }
    public double divide(int a, int b) {
//        if(b==0) {
//            System.out.println("Division by zero");
//            return 0;
//        }
        return a/b;
    }
    public int multiply(int a, int b) {
        return a*b;
    }
}
