package com.java;

import java.util.*;
import java.util.stream.Collectors;

public class CountOccurrences {
    public static void main(String[] args) {
        // Example array
        int[] numbers = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};

        // Convert int[] to List<Integer> for Stream operations
        List<Integer> numberList = Arrays.stream(numbers).boxed().collect(Collectors.toList());

        // Count occurrences using Stream API
        Map<Integer, Long> occurrences = numberList.stream()
                .collect(Collectors.groupingBy(num -> num, Collectors.counting()));

        // Print the occurrences
        occurrences.forEach((key, value) -> 
            System.out.println("Number " + key + " occurs " + value + " times."));
        
        int[] numbers2 = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4,1,5,3,3};
        
        List<Integer> collectInt = Arrays.stream(numbers2).boxed().collect(Collectors.toList());
        
        Map<Integer,Long> collect = collectInt.stream().collect(Collectors.groupingBy(num->num,Collectors.counting()));
        
        collect.forEach((key,value) -> System.out.println(key +" "+ value));
        
        // without java 8 below
        
     // Create a map to store the count of each number
        Map<Integer, Integer> occurrences3 = new HashMap<>();

        // Loop through the array
        for (int number : numbers) {
            // If the number is already in the map, increment its count
            if (occurrences3.containsKey(number)) {
                occurrences3.put(number, occurrences3.get(number) + 1);
            } else {
                // Otherwise, add it to the map with a count of 1
                occurrences3.put(number, 1);
            }
        }

        // Print the occurrences
        for (Map.Entry<Integer, Integer> entry : occurrences3.entrySet()) {
            System.out.println("Number " + entry.getKey() + " occurs " + entry.getValue() + " times.");
        }
        
    }
    
   
}
 