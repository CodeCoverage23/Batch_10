package com.assignment_5.basic;

import java.util.Scanner;

/*
 * 6. Write the program to check whether the no is greater than 100.
 */
public class Assignment5_6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
		sc.close();
		
		if(num > 100) {
			System.out.println("The number is greater than 100");
		}
		else {
			System.out.println("The number is not greater than 100");
		}
		
		
	}

}
