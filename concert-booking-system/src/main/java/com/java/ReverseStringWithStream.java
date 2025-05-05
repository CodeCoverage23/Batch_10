package com.java;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseStringWithStream {
    public static void main(String[] args) {
        // Input string
        String input = "Hello";

        // Reverse string using Stream API
        String reversed = IntStream.range(0, input.length())
                .mapToObj(i -> input.charAt(input.length() - 1 - i))
                .map(Object::toString)
                .collect(Collectors.joining());

        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);
    }
}

