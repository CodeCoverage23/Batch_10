package com.assignment_6.basic;

import java.util.Scanner;

/*
 * 4. Design method int factorial(int no)  which returns int value to that method. 
 * print the results into main method (Example enter no as 5, factorial means 5*4*3*2*1 then output is 120)

 */
public class Assignment6_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		sc.close();
		
		int result = factorial(num);
		System.out.println("The factorial of " + num + " is " + result);
	}
	public static int factorial(int no) {
		int result = 1;
		for(int i = 1; i <= no; i++) {
			result = result * i;
		}
		return result;
				
	}


}
