package com.basic.collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		SortedSet<Integer> s = new TreeSet<Integer>();

		s.add(101);
		s.add(121);
		s.add(191);
		s.add(121);
		s.add(161);
		s.add(171);
		s.add(10);
		s.add(1901);
		s.add(151);

		System.out.println(s);

		
		
	}

}
