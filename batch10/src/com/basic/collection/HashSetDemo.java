package com.basic.collection;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {

		HashSet<Integer> h = new HashSet<Integer>();

		h.add(42);
		h.add(44);
		h.add(22);
		h.add(4);
		h.add(2);
		h.add(42);
		h.add(4);
		h.add(null);

		System.out.println(h);


	}

}
