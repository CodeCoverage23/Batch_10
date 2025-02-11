package com.basic.collection;

import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetDemo {

	public static void main(String[] args) {

		NavigableSet<Integer> n = new TreeSet<Integer>();

		n.addAll(List.of(45, 78, 65, 23, 44, 89, 55, 39));

		System.out.println(n);

		System.out.println(n.floor(40));
		System.out.println(n.ceiling(40));
		System.out.println(n.lower(40));
		System.out.println(n.higher(40));

		System.out.println(n.headSet(65));
		System.out.println(n.tailSet(65));
		System.out.println(n.descendingSet());

	}

}
