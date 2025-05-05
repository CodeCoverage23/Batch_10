package com.shiv.basics;

import java.util.Scanner;

//if it is equal to the sum of cubes of its digits for example 0, 1, 153, 370, 371, 407 etc.
public class amstrong {

	public static void main(String args[]) {

		int c=0,temp,r;
		System.out.println("Enter no");
		Scanner sc = new Scanner(System.in);
		//Add a = new Add();
		Add.f1(false);
		int n = sc.nextInt();

		temp = n;

		while(n>0){
			r = n%10;
			n=n/10;
			c = c+(r*r*r);
		}
		if(temp == c){
			System.out.println(temp+" is Amstrong no");	
		}else{
			System.out.println(temp+" is not Amstrong no");
			
		}
	}
}
