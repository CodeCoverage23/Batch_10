package com.basic.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {

		Set<String> s = new LinkedHashSet<>();

		s.add("Java");
		s.add("C++");
		s.add("Python");
		s.add("Python");
		s.add("HTML");
		s.add("Scala");
		s.add("Go");
		System.out.println(s.add("Go"));
		System.out.println(s.add("Ruby"));

		System.out.println(s);

		Set<String> h = new HashSet<String>(s);

		System.out.println(h);

	}

}
