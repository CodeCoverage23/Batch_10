package com.basic.exception;

public class FinallyBlockDemo {

	public static void main(String[] args) {

		// Exception is handled
		try {

			String s1 = null;

			int length = s1.length();

			System.out.println(length);

		} catch (NullPointerException e) {

			System.out.println(e.getMessage());

		} finally {
			System.out.println("Exception is handled.... Always Execute...");
		}

		System.out.println("Rest of the code..");
		System.out.println("=========================================================");
		// Exception is not handled
		try {

			String s1 = null;

			int length = s1.length();

			System.out.println(length);

		} catch (ArithmeticException e) {

			System.out.println(e);

		} finally {
			System.out.println("Exception is not handled.... Always Execute...");
		}

		System.out.println("Rest of the code..");

	}

}
