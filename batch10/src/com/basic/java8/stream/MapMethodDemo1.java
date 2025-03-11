package com.basic.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapMethodDemo1 {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("bike", "train", "bus", "sheep", "airplain", "car");

		// Get the vehicles in upper case

		// Without stream

		/*
		 * for (String s : list) { System.out.println(s.toUpperCase()); }
		 */

		// With Stream

		list.stream().map(v -> v.toUpperCase()).forEach(System.out::println);

		// Get the length of strings

		List<Integer> vehicleLength = list.stream().map(v -> v.length()).collect(Collectors.toList());
		System.out.println(vehicleLength);

		// Get the strings which has chars less than or equal to 4 with upper case

		// without stream

		/*
		 * ArrayList<String> arrayList = new ArrayList<String>(); for (String s : list)
		 * { if (s.length() <= 4) { arrayList.add(s.toUpperCase()); } }
		 * System.out.println(arrayList);
		 */

		// With stream

		List<String> filteredList = list.stream().filter(v -> v.length() <= 4).map(v -> v.toUpperCase()).toList();
		System.out.println(filteredList);

		list.stream().filter(v -> v.length() <= 4).map(v -> v.toUpperCase()).toList()
				.forEach(v -> System.out.println(v));

	}

}
