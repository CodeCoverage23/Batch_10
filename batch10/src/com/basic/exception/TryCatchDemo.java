package com.basic.exception;

public class TryCatchDemo {

	public static void main(String[] args) {

		try {
			int a = 10;

			int b = a / 0;

		} catch (ArithmeticException e) {
			System.out.println("Divide by zero is not possible");
		}

		System.out.println("Rest of the code");

	}

}
