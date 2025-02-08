package com.basic.collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {

		List<Integer> l = new LinkedList<>();
		l.add(46);
		l.add(47);
		l.add(46);
		l.add(74);
		l.add(49);
		l.add(45);
		l.add(45);
		System.out.println(l);

		l.removeFirst();
		l.removeLast();

		System.out.println(l);

		l.addFirst(null);
		l.addLast(999);

		System.out.println(l);

		l.remove(3);
		l.remove(Integer.valueOf(40));

		System.out.println(l);

		for (Integer i : l) {
			System.out.println(i);
		}

		l.forEach(e -> System.out.println(e));

	}

}
