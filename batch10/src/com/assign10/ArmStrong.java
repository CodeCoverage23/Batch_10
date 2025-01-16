package com.assign10;

import java.util.Scanner;

/*
 * Write java program to check whether number is Armstrong or not.(A positive number is called
armstrong number if it is equal to the sum of cubes of its digits for example 0, 1, 153, 370, 371, 407 etc.
Let's try to understand why 153 is an Armstrong number.

153

1634

1
2
3

 */
public class ArmStrong {
	
	public boolean isArmstrong(int n) {
		
		int digit=0;
		int last=0;
		int sum=0;
		
		int temp=n;
		
		while(temp>0) {
			digit++;
			temp/=10;
		}
		temp=n;
		while(temp>0) {
			last = temp%10;
			sum += (Math.pow(last, digit));
			temp/=10;
		}
		
		if(sum==n) {
			return true;
		}else {
			return false;
		}
		
		
	}

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the number to Check if it is armstrong number :");
	  int n=sc.nextInt();
	  
	  ArmStrong a= new ArmStrong();
	  
	  if(a.isArmstrong(n)) {
		  System.out.println(n +" is a armstrong number. ");
	  }
	  else {
		  System.out.println(n+" is not a armstrong number.");
	  }

	}

}
