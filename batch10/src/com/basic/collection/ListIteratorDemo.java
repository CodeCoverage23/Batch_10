package com.basic.collection;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {

		List<String> l = new LinkedList<String>();
		l.add("Pune");
		l.add("Akola");
		l.add("Amaravti");
		l.add("Mumbai");
		l.add("Dhule");
		l.add("Nagpur");

		System.out.println(l);

		ListIterator<String> listIterator = l.listIterator();

		while (listIterator.hasNext()) {
			String next = listIterator.next();

			if (next.equals("Dhule")) {
				listIterator.set("Beed");
			}

			if (next.equals("Akola")) {
				listIterator.remove();
			}

			System.out.println(next);

		}

		System.out.println(l);

	}

}
