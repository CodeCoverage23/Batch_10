package com.basic.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapMethodDemo1 {

	public static void main(String args[]) {

		List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 5, 6);
//		List<Integer> l2 = Arrays.asList(1, 2, 3, 4, 5, 6);
//		List<Integer> l3 = Arrays.asList(1, 2, 3, 4, 5, 6);

		List<Integer> list1 = Arrays.asList(1, 2);
		List<Integer> list2 = Arrays.asList(3, 4);
		List<Integer> list3 = Arrays.asList(5, 6);

		List<List<Integer>> listOfList = Arrays.asList(list1, list2, list3);

		System.out.println(l1);
		System.out.println(listOfList);

		System.out.println("----------------------------------------------");

		List<Integer> collect = l1.stream().map(m -> m + 10).collect(Collectors.toList());
		System.out.println(collect);

		List<Integer> list = listOfList.stream().flatMap(m -> m.stream().map(e -> e + 10)).collect(Collectors.toList());
		System.out.println(list);

	}

}
