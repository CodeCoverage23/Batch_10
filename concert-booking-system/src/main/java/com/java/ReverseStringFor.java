package com.java;

public class ReverseStringFor {
    public static void main(String[] args) {
        // Input string
        String input = "Hello";

        // Create an empty string to store the reversed result
        String reversed = "";

        // Iterate the string from the end to the beginning
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i); // Append each character to the result
        }

        // Print the original and reversed strings
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);
    }
}
