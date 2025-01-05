package com.Assign5;

import java.util.Scanner;

public class Que2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int a = sc.nextInt();		
		
		if((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0))  {
			System.out.println("Leap Year");
		}
		else {
			System.out.println("Not A Leap Year");
		}

	}
}
