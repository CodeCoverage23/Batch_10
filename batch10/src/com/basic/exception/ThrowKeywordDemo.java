package com.basic.exception;

public class ThrowKeywordDemo {

	public static void main(String[] args) {

		int age = 16;

		if (age < 18) {

			throw new RuntimeException("You can not vote...");

		} else {
			System.out.println("Can Vote...");

		}

		System.out.println("Rest of the code");

	}

}
