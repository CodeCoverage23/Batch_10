package com.basic;

import com.basic.collection.Employee;

public class GarbageCollectionDemo {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		Employee e2 = new Employee();

		e1 = null;
		e2 = null;

		System.gc();

	}

	@Override
	public void finalize() {
		System.out.println("object is garbage collected");
	}

}
