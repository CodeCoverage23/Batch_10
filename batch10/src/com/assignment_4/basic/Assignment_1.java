package com.assignment_4.basic;

/*
 *  Write the java program to design method for addition of two number 
 *  which returns int results to that method and result should be print into main method
 */

public class Assignment_1 {
	public static int add(int a, int b) {
		return a+b;
	}

	public static void main(String[] args) {
		//Variable to hold the numbers
		
				int num1 = 10;
				int num2 = 20;
				
				//Calling the add method and storing the result
				
				int result = add(num1, num2);
				
				System.out.println("The Addition of: " + num1 + " + " + num2 + " = " + result);
				
	}

}
