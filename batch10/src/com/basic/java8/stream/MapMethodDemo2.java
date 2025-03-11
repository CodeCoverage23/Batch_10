package com.basic.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapMethodDemo2 {

	public static void main(String[] args) {

		List<Integer> integerList = Arrays.asList(21, 83, 45, 7, 18, 1, 39, 77, 40);
		System.out.println(integerList);

		// Get the list as a cube
		List<Integer> cubeList = integerList.stream().map(i -> i * i * i).collect(Collectors.toList());
		System.out.println(cubeList);

		// Multiply by 5
		integerList.stream().map(i -> i * 5).toList().forEach(i -> System.out.println(i));

	}

}
