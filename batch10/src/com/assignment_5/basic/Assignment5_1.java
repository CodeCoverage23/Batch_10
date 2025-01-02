package com.assignment_5.basic;

import java.util.Scanner;

/*
 * 1.write a program to check the number is positive or negative.
 */
public class Assignment5_1 {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		sc.close();
		
		if(num > 0) {
			System.out.println("The number is Positive : ");
			
		}
		else if (num < 0) {
			System.out.println("The number is Negative: ");
			
		}
		else {
			System.out.println("The number is Zero");
			
		}
	
		
		}


}
