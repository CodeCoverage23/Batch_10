//2.write a program to check whether year is leap year or not. (If else stmt).
package com.assignment5;

import java.util.Scanner;

public class Que2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year:");
		int yr = sc.nextInt();
		if(yr%4==0) {
			System.out.println(yr + "year is leap year");
		}
		else {
			System.out.println(yr +"year is not leap yearno");
		}
	}
}
