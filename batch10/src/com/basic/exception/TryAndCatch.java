package com.basic.exception;

public class TryAndCatch {

	public static void main(String[] args) {
		try {
			int a = 10;
			int b = a/0;
			
		} catch (ArithmeticException e) {
			System.out.println("Divide");
		}
		System.out.println("Rest of the code..");	

	}

}
