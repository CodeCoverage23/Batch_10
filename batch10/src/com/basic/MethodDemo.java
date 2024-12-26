package com.basic;

public class MethodDemo {

	public static void main(String[] args) {
		displayAdd();
		twoParametersMethod(44, 88.5f);
		String s1 = name();
		System.out.println(s1);

		int i = add(100, 5000);
		System.out.println(i);

	}

	public static void displayAdd() {
		System.out.println(100 + 300);
	}

	static void twoParametersMethod(int a, float b) {
		System.out.println(a + b);
	}

	public static String name() {
		String s = "Code Coverage";
		return s;
	}

	public static int add(int a, int b) {
		return a + b;
	}

}
