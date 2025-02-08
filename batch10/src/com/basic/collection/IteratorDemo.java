package com.basic.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;

public class IteratorDemo {

	public static void main(String[] args) {

		ArrayList<String> a = new ArrayList<>();

		for (int i = 1; i <= 10; i++) {
			String uuid = UUID.randomUUID().toString();
			a.add(uuid);
		}
		System.out.println(a);

		Iterator<String> itr = a.iterator();

		while (itr.hasNext()) {
			
			String string = itr.next();
			System.out.println(string.toUpperCase());
		}

	}

}
