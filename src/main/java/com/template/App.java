package com.template;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

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

    // 11. Sum of Elements in a List
    public int sumList(List<Integer> list) {
        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        return sum;
    }

    // 12. Find the Largest Element in a List
    public int findMax(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("List cannot be null or empty");
        }
        int max = list.get(0);
        for (int i : list) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    // 13. Filter Even Numbers from a List
    public List<Integer> filterEvenNumbers(List<Integer> list) {
        List<Integer> evenList = new ArrayList<>();
        for (int i : list) {
            if (i % 2 == 0) {
                evenList.add(i);
            }
        }
        return evenList;
    }

    // 14. Concatenate Two Lists
    public List<String> concatenateLists(List<String> list1, List<String> list2) {
        List<String> newString = new ArrayList<>();
        for (String s : list1) {
            newString.add(s);
        }
        for (String s2 : list2) {
            newString.add(s2);
        }
        return newString;
    }

    // 15. Check if List Contains Element
    public boolean listContains(List<String> list, String element) {
        boolean result = false;
        for (String s : list) {
            if (s.equals(element)) {
                result = true;
            }
        }
        return result;
    }

    // 16. Convert Strings to Uppercase
    public List<String> toUpperCase(List<String> list) {
        List<String> upperList = new ArrayList<>();
        for (String s : list) {
            upperList.add(s.toUpperCase());
        }
        return upperList;
    }

    // 17. Remove Duplicates from a List
    public List<Integer> removeDuplicates(List<Integer> list) {
        List<Integer> removedList = new ArrayList<>();
        for (int num : list) {
            if (!removedList.contains(num)) {
                removedList.add(num);
            }
        }
        return removedList;
    }

    // 18. Convert List to Set for Unique Elements
    public Set<Integer> listToSet(List<Integer> list) {
        Set<Integer> mySet = new HashSet<Integer>();
        for (int i : list) {
            if (!mySet.contains(i))
                mySet.add(i);
        }
        return mySet;
    }

    // 19. Check if Map Contains Key
    public boolean mapContainsKey(Map<String, String> map, String key) {
        boolean result = false;
        for (String s : map.keySet()) {
            if (s.equals(key)) {
                result = true;
            }
        }
        return result;
    }

    // 20. Check if Map Contains Value
    public boolean mapContainsValue(Map<String, String> map, String value) {
        boolean result = false;
        for (String s : map.values()) {
            if (s.equals(value)) {
                result = true;
            }
        }
        return result;
    }

    // 21. Iterate Over a Map
    public List<String> iterateMap(Map<String, String> map) {
        List<String> newList = new ArrayList<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String line = entry.getKey() + " -> " + entry.getValue();
            newList.add(line);
        }
        return newList;
    }
}

