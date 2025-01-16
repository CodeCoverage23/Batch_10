package com.assign10;

import java.util.Scanner;

/*
 * 1. Write Java program to check whether number is prime or not. 
 * ( Prime means a number which is
divisible by only two numbers: 1 and itself. So, if any number is divisible by any other number,
 it is not a
prime number.)
 */

public class PrimeNo {
	
	public void isPrime(int m) {
		if(m==0 || m==1) {
			System.out.println(m + " is not a prime number.");
		}else {
			int flag = 0;
			
			for(int i =2;i<m;i++) {
				if(m%i==0) {
					flag =1;
				}
			}
			if(flag == 1) {
				System.out.println(m+" is not a prime number.");
			}else {
				System.out.println(m+" is a prime number.");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int m=sc.nextInt();
		
		PrimeNo p= new PrimeNo();
		p.isPrime(m);

	}

}
