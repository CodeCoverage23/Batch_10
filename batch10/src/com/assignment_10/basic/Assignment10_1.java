package com.assignment_10.basic;

import java.util.Scanner;

/*
 * 1. Write Java program to check whether number is prime or not. ( Prime means a number which is
divisible by only two numbers: 1 and itself. So, if any number is divisible by any other number, it is not a
prime number.)
 */

public class Assignment10_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = sc.nextInt();
		
		if(isPrime(num)) {
			System.out.println(num +"is a prime number");
			}
		else {
			System.out.println(num + "is not a prime number");
		}
		sc.close();
	}

	private static boolean isPrime(int num) {
      if(num <= 1) {

		return false;
	}
      for(int i = 2; i <= Math.sqrt(num); i++) {
    	  if(num % i == 0) {
    		  return false;
    	  }
      }
      return true;

   }
}
