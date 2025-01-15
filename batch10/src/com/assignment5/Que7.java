//7. Write the program to print the square of any number.
package com.assignment5;

import java.util.Scanner;

public class Que7 {
	static int square(int a) {
		return(a*a);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		int sqr=square(a);
		System.out.println("Square of "+a+ "is " +sqr);
		
	}
}
