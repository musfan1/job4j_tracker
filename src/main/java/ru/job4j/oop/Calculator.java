package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int y) {
        return y - x;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int divide(int y) {
        return y / x;
    }

    public int sumAllOperation(int y) {
        return sum(y) + minus(y) + multiply(y) + divide(y);
    }

    public static void main(String[] args) {
        int result = sum(1);
        System.out.println(result);
        result = minus(2);
        System.out.println(result);
        Calculator calculator = new Calculator();
        result = calculator.multiply(3);
        System.out.println(result);
        result = calculator.divide(4);
        System.out.println(result);
        result = calculator.sumAllOperation(5);
        System.out.println(result);
    }
}
