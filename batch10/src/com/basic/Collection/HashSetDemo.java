package com.basic.Collection;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<Integer> s = new HashSet<Integer>();
		
		s.add(42);
		s.add(4);
		s.add(22);
		s.add(76);
		s.add(42);
		s.add(4);
		s.add(5);
		s.add(null);
System.out.println(s);
	}

}
