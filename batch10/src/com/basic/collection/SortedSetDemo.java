package com.basic.collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {

	public static void main(String[] args) {

		SortedSet<String> s = new TreeSet<String>();

		s.add("Pavan");
		s.add("Vijay");
		s.add("Kishor");
		s.add("Dipak");
		s.add("Sachin");
		s.add("Akshay");
		s.add("Bbushan");
		s.add("Chetan");

		System.out.println(s);
		System.out.println(s.subSet("Dipak", "Pavan"));

	}

}
