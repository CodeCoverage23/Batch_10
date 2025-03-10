package com.basic.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FilterMethodDemo1 {

	public static void main(String[] args) {

//		List<Integer> l = new ArrayList<>();
//		l.add(100);
//		l.add(200);
//		l.add(200);
//		l.add(200);
//		l.add(200);

		List<Integer> list = Arrays.asList(4, 5, 14, 7, 8, 22, 6, 1, 23, 48, 45, 45);

		// List<Integer> list2 = List.of(4, 9, 8, 2, 56, 87, 96, 36, 12, 55);

		// Without Stream

		for (Integer l : list) {
			System.out.println(l);
		}

		// With Stream

		list.stream().forEach(l -> System.out.println(l));

		System.out.println("*************************************************");

		// Get even numbers list - without stream
		ArrayList<Integer> evenNumberList = new ArrayList<Integer>();

		for (Integer l : list) {
			if (l % 2 == 0) {
				evenNumberList.add(l);
			}
		}
		System.out.println("Without Stream " + evenNumberList);

		// With Stream

		List<Integer> evenNum = list.stream().filter(entry -> entry % 2 == 0).sorted().collect(Collectors.toList());
		System.out.println("With Stream " + evenNum);

//		list = list.stream().filter(entry -> entry % 2 == 0).collect(Collectors.toList());
//		System.out.println(list);

		list.stream().filter(entry -> entry % 2 == 0).collect(Collectors.toList()).forEach(f -> System.out.println(f));
		System.out.println("*************************************************");

		list.stream().filter(entry -> entry % 2 == 0).collect(Collectors.toList()).forEach(System.out::println);

		// Get the list sorted
		evenNum = evenNum.stream().sorted().toList();

		System.out.println(evenNum);

	}

}
