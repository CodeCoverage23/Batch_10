package com.assignment_10.basic;

import java.util.Scanner;

/*
 * 3. Write java program to check whether number is Armstrong or not.
 * (A positive number is called armstrong number if it is equal to the sum of cubes of its digits
 *  for example 0, 1, 153, 370, 371, 407 etc. Let's try to understand why 153 is an Armstrong number. 
 *  153 = (1*1*1)+(5*5*5)+(3*3*3) 
 *  where: (1*1*1)=1 (5*5*5)=125 (3*3*3)=27 
 *  So: 1+125+27=153)
 */
public class Assignment10_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		if(isArmstrong(num)) {
			System.out.println(num + "is an Armstrong number: ");
			}
		else {
			System.out.println(num + "is not an Armstrong number: ");
		}
		sc.close();
	}

	private static boolean isArmstrong(int num) {
		int originalNumber= num;
		int result = 0;
		int n = String.valueOf(num).length();
		
		while(num != 0) {
			int digit = num % 10;
			result += Math.pow(digit, n);
			num /= 10;
		}
		return result == originalNumber;
	}
      
}
