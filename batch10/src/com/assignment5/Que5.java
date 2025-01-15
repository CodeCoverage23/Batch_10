//5. Write a program to check whether number is even or odd.
package com.assignment5;

import java.util.Scanner;

public class Que5 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number: ");
	int num = sc.nextInt();
	if(num%2==0) {
		System.out.println("Even number is Entered");
	}
	else {
System.out.println("Entered number is odd");		
	}
}
}
