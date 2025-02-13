package com.assignment_10.basic;

import java.util.Scanner;

/*
 * 2. Write a java program to display the Fibonacci series up to given number. (Fibonacci series mean next
number is the sum of previous two numbers for example 0,1,1,2,3,5,8,13,21,34,55 etc. If enter no as 5
then output is 0,1,1,2,3).
 */
public class Assignment10_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		sc.close();
		
		System.out.println("Fibonacci series up to" + num + ": ");
		for(int i = 0; i < num; i++) {
			System.out.println(fibonacci(i) + " ");
			
		}
	}

	private static int fibonacci(int n) {
      if(n == 0) {
    	  return 0;
      }
      else if (n == 1) {
    	  return 1;
      }
      else {
    	  return fibonacci(n - 1) + fibonacci(n - 2);
      }

		}
}
