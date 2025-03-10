package com.basic.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FilterMethodDemo2 {

	public static void main(String[] args) {

		List<String> cityList = Arrays.asList("Pune", "Mumbai", "Kolhapur", "Akola", "Nagpur", "Delhi", "Goa");

		// Get the cities with chars more than 5

		// Without stream
		List<String> list = new ArrayList<>();
		for (String s : cityList) {
			if (s.length() > 5) {
				list.add(s);
			}
		}
		System.out.println(list);

		// With Stream
		/*
		 * List<String> filteredList = cityList.stream().filter(s -> s.length() >
		 * 5).collect(Collectors.toList()); System.out.println(filteredList);
		 */

		cityList.stream().filter(s -> s.length() > 5).collect(Collectors.toList()).forEach(e -> System.out.println(e));

		List<String> filteredList = cityList.stream().filter(s -> s.length() > 5).sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		System.out.println(filteredList);

		// Get cities with chars 4 and 6

		System.out.println("---------------------------------------------");

		cityList.stream().filter(s -> s.length() >= 4 && s.length() <= 6).sorted().collect(Collectors.toList())
				.forEach(System.out::println);

	}

}
