package com.basic.exception;

/**
 * Compile time exception or checked exception
 */
public class TestCustomException1 {

	public static void main(String[] args) throws InvalidAgeException {

		int age = 16;

		System.out.println("validations checks...");

		if (age > 18) {
			System.out.println("You can vote");
		} else {
			throw new InvalidAgeException("You are under 18");
		}

		System.out.println("Rest of the code");
	}

}
