//8. Write a program to swap the two numbers.
package com.assignment5;

import java.util.Scanner;

public class Que8 {
	 static void swap(int a,int b) {
		 System.out.println("Given Number are: "+a+ " " +b);
		int temp=a;
		a=b;
		b=temp;
		 System.out.println("After swapping Numbers are: "+a+ " " +b);
	 }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two numbers: ");
		int a =sc.nextInt();
		int b =sc.nextInt();
		
		swap(a,b);
	}
}
