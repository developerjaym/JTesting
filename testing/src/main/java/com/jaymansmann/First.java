package com.jaymansmann;

public class First {
    public static boolean isOdd(int input) {
        return input % 2 == 0;
    }

    public static String toUpperCase(String input) {
        if(input == null || input.isEmpty() || input.isBlank()) {
            // input is null or empty or blank
            // just return the input as-is.
            return input;
        }
        else if(input.toUpperCase().equals(input)) {
            // input is already uppercase
            // just return the input as-is
            return input;
        }
        return input.toUpperCase();
    }

    public static void print(String input) {
        System.out.println(input);
    }
}
