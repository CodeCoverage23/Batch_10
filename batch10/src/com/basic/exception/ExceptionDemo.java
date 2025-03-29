package com.basic.exception;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		String s = "12";
		
		System.out.println(s.length());
		
		System.out.println("Before exception");
		
		System.out.println("Rest of the code..After Exception");
		System.out.println("Rest of the code..");
		System.out.println("Rest of the code..");
		System.out.println("Rest of the code..");
		
		String s1 = "CodeCoverage";
		
		for(int i = 0; i<=s1.length();i++) {
			char c= s1.charAt(i);
			System.out.println(c);
		}
	}

}
