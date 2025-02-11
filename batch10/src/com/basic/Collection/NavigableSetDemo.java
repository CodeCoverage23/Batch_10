package com.basic.Collection;

import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetDemo {

	public static void main(String[] args) {
		
		NavigableSet<Integer> n = new TreeSet<Integer>();
		
		n.addAll(List.of(45,67,89,22,89));
		
		System.out.println(n);
		
		System.out.println(n.floor(40));
		System.out.println(n.ceiling(40));
		System.out.println(n.lower(40));
		System.out.println(n.higher(40));

		System.out.println(n.headSet(67));
		System.out.println(n.tailSet(67));
		System.out.println(n.descendingSet());
	}

}
