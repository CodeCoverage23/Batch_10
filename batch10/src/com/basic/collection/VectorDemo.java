package com.basic.collection;

import java.util.ArrayList;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {

		Vector<String> v = new Vector<String>();

		v.addElement("Java");
		v.addElement("Python");
		v.addElement("Go");
		v.addElement("Ruby");
		v.addElement("Scala");

		System.out.println(v);

		Vector<Integer> v2 = new Vector<Integer>(50);
		System.out.println(v2.size());

		Vector<Integer> v3 = new Vector<Integer>(50, 8);

		ArrayList<String> l = new ArrayList<String>(v);
		// l.addAll(v);

		System.out.println(l);
		
		Vector<String> v4 = new Vector<>(l);


	}

}
