package com.basic.Collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		List<Integer> l = new LinkedList<Integer>();
		l.add(46);
		l.add(96);
		l.add(26);
		l.add(44);
		l.add(90);
		System.out.println(l);
		
		l.removeFirst();
		System.out.println(l);
		
		l.removeLast();
		System.out.println(l);
		
		l.remove(2);
		System.out.println(l);
		
		l.add(700);
		System.out.println(l);
		
		l.remove(Integer.valueOf(96));
		System.out.println(l);
	}

}
