package com.basic.Collection;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add("Code");
		al.add(1200);
		al.add(100);
		al.add(null);
		al.add(8.7f);
		
		System.out.println(al);
		
		al.remove(2);
		al.set(3,"Not null");
		
		System.out.println(al);
		
		System.out.println(al.get(3));
		
		al.removeFirst();
		System.out.println(al);
		
		System.out.println(al.size());
		
//		ArrayList<Integer> l = new ArrayList<Integer>();
//		l.add(12);
//		System.out.println(l);
	}

}
