package com.basic.Collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {

	public static void main(String[] args) {

	SortedSet<String> s = new TreeSet<String>();
		
		s.add("Pavan");
		s.add("Tushar");
		s.add("Kant");
		s.add("ShriKrishna");
		s.add("Abhay");
		s.add("Nayan");
		s.add("Deep");
		
		System.out.println(s);
		System.out.println(s.subSet("Kant", "Pavan"));

	}

}
