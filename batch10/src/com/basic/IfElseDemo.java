package com.basic;

public class IfElseDemo {

	public static void main(String[] args) {

		int age = 16;

		// Example - 1
		if (age > 18) {
			System.out.println("You are eligible for the voter card");
		} else {
			System.out.println("You are not eligible for the voter card");
		}

		// Example - 2

		long a = 10;
		long b = 20;

		long c = a + b;

		if (c >= 50) {
			System.out.println(c + " is greater than 50");
		} else {
			System.out.println(c + " is less than 50");
		}

		// Example - 3

		if (a % 2 == 0) {
			System.out.println("Even Number");
		} else {
			System.out.println("Odd Number");
		}

	}

}
