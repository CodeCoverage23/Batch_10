package com.basic.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class FailFastIteratorDemo {

	public static void main(String args[]) {

		String s1 = "ConcurrentModificationException";
		System.out.println("CME Length : " + s1.length());

		List<Integer> asList = Arrays.asList(4, 2, 1, 5, 3, 4, 9, 7, 6);

		ArrayList<Integer> al = new ArrayList<Integer>();

		for (int i = 1; i <= 10; i++) {
			al.add(i);
		}

		Iterator<Integer> i = al.iterator();

		while (i.hasNext()) {
			System.out.println(i.next());
			al.add(5);
		}

	}

}
