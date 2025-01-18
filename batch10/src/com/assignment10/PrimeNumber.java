package com.assignment10;
import java.util.Scanner;
public class PrimeNumber {
	public void isPrime(int n) {
		if(n == 0 || n ==1){
			System.out.println(n+ "is not a PRIME number");
		}else {
			int flag = 0;
			
			for(int i =2; i<n; i++) {
				if(n%i ==0) {
					flag = 1;
				}
			}
			if(flag == 1) {
				System.out.println(n+ "  is not a prime number");
			}else {
				System.out.println(n+ "  is a prime number");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number");
int n=sc.nextInt();
PrimeNumber p = new PrimeNumber();
p.isPrime(n);
	}

}
