//1.write a program to check the number is positive or negative.
package com.assignment5;
import java.util.*;

public class Que1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int num =sc.nextInt();
		if(num>=0) {
			System.out.println("Number is Positive");
		}
		else {
			System.out.println("Number is Negative");
		}
	}
}
