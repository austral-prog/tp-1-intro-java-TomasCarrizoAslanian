package com.template;

public class App {

    // 1. Sum of Two Integers
    public int sum(int a, int b) {
        return a + b;
    }

    // 2. Check Even or Odd
    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    // 3. Maximum of Two Numbers
    public int max(int a, int b) {
        return (a > b) ? a : b; // operador ternario
    }

    // 4. Factorial of a Number
    public int factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Negative numbers not allowed");
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // 5. Count Characters in a String
    public int countChars(String input) {
        if (input == null) return 0;
        return input.length();
    }

    // 6. Reverse a String
    public String reverse(String input) {
        if (input == null) return null;
        return new StringBuilder(input).reverse().toString();
    }

    // 7. Check Prime Number
    public boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    // 8. Find the Smallest Element in an Array
    public int findMin(int[] array) {
        if (array == null || array.length == 0)
            throw new IllegalArgumentException("Array is empty or null");
        int min = array[0];
        for (int num : array) {
            if (num < min) min = num;
        }
        return min;
    }

    // 9. Sum of Elements in an Array
    public int arraySum(int[] array) {
        int sum = 0;
        if (array != null) {
            for (int num : array) {
                sum += num;
            }
        }
        return sum;
    }

    // 10. Convert Celsius to Fahrenheit
    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
