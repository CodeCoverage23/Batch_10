package com.basic.Collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		SortedSet<Integer> s = new TreeSet<Integer>();
		
		s.add(101);
		s.add(121);
		s.add(111);
		s.add(223);
		s.add(34);
		s.add(987);
		s.add(509);
		
		System.out.println(s);

	}

}
