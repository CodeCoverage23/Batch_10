package com.shiva.java8.coddingQA;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterFrequency {
    public static void main(String[] args) {
        String input = "hello java by shiva";

        final int a=0;
        // Convert the string to a stream of characters and count occurrences
        Map<Character, Long> characterFrequency = input.chars()
                .filter(c -> c != ' ') // Ignore spaces
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Display the frequency of each character
        characterFrequency.forEach((character, frequency) -> 
                System.out.println("'" + character + "' -> " + frequency));
    }
}

