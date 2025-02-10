package com.basic.Collection;

import java.util.ArrayList;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		Vector<String> v = new Vector<String>();
		
		v.add("java");
		v.add("C++");
		v.add("Python");
		v.add("Ruby");
		v.add("HTML");
		
		System.out.println(v);
		
		Vector<Integer> v2 = new Vector<Integer>(50);
		System.out.println(v2.size());
		
		Vector<Integer> v3 = new Vector<Integer>(50,8);
		
		ArrayList<String> l =new ArrayList<String>(v);
		System.out.println(l);
		
		Vector<String> v4 = new Vector<>(l);

	}

}
