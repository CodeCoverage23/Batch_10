package com.basic.collection;

import java.util.ArrayList;

public class ArraysListDemo {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		al.add("CodeCoverage");
		al.add(100);
		al.add(100);
		al.add(null);
		al.add(8.7f);
		al.add("Java");

		System.out.println(al);

		al.remove(2);
		al.set(3, "Not null");

		System.out.println(al);

		System.out.println(al.get(4));

		al.removeFirst();

		System.out.println(al);
		
		System.out.println(al.size());
		
		
		ArrayList<Integer> l = new ArrayList<>();
		l.add(12);
		//l.add("J"); -> Strings are not allowed here
		

		

	}

}
