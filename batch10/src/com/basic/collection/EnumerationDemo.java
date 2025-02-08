package com.basic.collection;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {

	public static void main(String[] args) {

		Vector<Float> v = new Vector<Float>();

		for (int i = 1; i <= 10; i++) {
			Float floatValue = Float.valueOf(i);
			v.add(floatValue);
		}

		System.out.println(v);

		Enumeration<Float> elements = v.elements();

		while (elements.hasMoreElements()) {

			Float nextElement = elements.nextElement() * 2;

			System.out.println(nextElement);
		}

	}

}
