package com.basic.exception;

import java.util.Stack;

public class TestCustomExceptionDemo1 {

	public static void main(String[] args) throws InvalidAgeException {
		
		int age =60;
		System.out.println("Validations checks...");
		
		if(age>18) {
			System.out.println("You can vote");
		}
		else {
			System.out.println("You cannot vote");
		}
		
		System.out.println("Rest of the code");

	}

}
