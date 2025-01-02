package com.assignment_4.basic;

/*
 * 2. Write the java program to design method for substraction of two number
 *  which returns int value to that method and result should be print into main method.
 */

public class Assignment4_2 {
	public static int sub(int a, int b) {
		return a-b;
	}

	public static void main(String[] args) {
		
		//Variable to hold the numbers
		
		int num1 = 100;
		int num2 = 20;
		
		//Calling the sub method and storing the result
		
		int result = sub(num1, num2);
		
		System.out.println("The substraction of: " + num1 + " - " + num2 + " = " + result);
		
		
		
   }


	}


