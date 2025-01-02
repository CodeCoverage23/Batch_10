package com.assignment_5.basic;

import java.util.Scanner;

/*
 * 5. Write a program to check whether number is even or odd.
 */
public class Assignment5_5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		sc.close();
		
		if(num % 2 == 0) {
			System.out.println("The number is even");
		}
		else {
			System.out.println("The number is odd");
		}
		
	}


}
