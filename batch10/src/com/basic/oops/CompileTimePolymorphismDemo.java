package com.basic.oops;

/**
 * It also refers to Method Overloading, Static Binding, Early Binding
 */
public class CompileTimePolymorphismDemo {

	public static void main(String[] args) {

		CompileTimePolymorphismDemo c = new CompileTimePolymorphismDemo();
		int a = c.add(11, 44);
		System.out.println(a);

		int b = c.add(11, 44, 44);
		System.out.println(b);

		System.out.println(c.division(144, 11.5f));
		System.out.println(c.division(144, 12));

	}

	// By changing number of parameters

	public int add(int a, int b) {
		return a + b;
	}

	public int add(int a, int b, int c) {
		return a + b + c;
	}

	// By changing data types of parameters

	public double division(int a, int b) {
		return a / b;
	}

	public double division(int a, float b) {
		return a / b;
	}
	
	
}
