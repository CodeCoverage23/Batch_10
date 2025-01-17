package Assign10;

import java.util.Scanner;

public class Prime {

	public void Isprime(int  n) {
		if(n==0 || n==1) {
			System.out.println("Not Prime");
		}
		else {
			int flag =0;
			for(int i =2; i<n;i++) {
				if(n%i==0) {
					flag=1;
				}
			}
			if(flag==1) {
				System.out.println("Not Prime");
			}
			else {
				System.out.println("Prime");
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number..");
		int n = sc.nextInt();
		
		Prime p = new Prime();
		p.Isprime(n);

	}

}
