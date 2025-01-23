package com.basic.exception;

public class Finally {

	public static void main(String[] args) {
		try {
			String s1 = null;
			int length = s1.length();
			System.out.println(length);
			
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Exception is not handled");
		}
		System.out.println("Rest of the code..");	

	}


}
