package com.basic.collection;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeIteratorDemo {

	public static void main(String args[]) {

		CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<Integer>();

		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}

		Iterator<Integer> i = list.iterator();

		while (i.hasNext()) {
			System.out.println(i.next());
			list.add(11);
		}

		System.out.println(list);

	}

}
