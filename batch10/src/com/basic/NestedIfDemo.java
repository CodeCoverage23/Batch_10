package com.basic;

public class NestedIfDemo {

	public static void main(String[] args) {

		int age = 22;
		int weight = 55;

		if (age >= 18) {
			System.out.println("Your age is in criteria..");

			if (weight > 50) {
				System.out.println("You can donate the Blood");
			}

		}
		System.out.println("Rest of the code");

	}

}
