package com.basic;

public class LogicalAndOr {

	public static void main(String[] args) {

		int a = 400;
		int b = 500;

		int c = 1000;

		if (b < c && a > c) {
			System.out.println("Logical And - Condition true");
		}

		if (a > c || b < c) {
			System.out.println("Logical Or - Condition true");
		}

	}

}
