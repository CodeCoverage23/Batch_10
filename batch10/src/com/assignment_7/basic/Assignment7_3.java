package com.assignment_7.basic;

import java.util.Scanner;

/*3. Design method to print factors of given number
 * ( Enter no = 6 then factors should be displayed like 1,2,3,6.
 */

public class Assignment7_3 {

	public void printFactor(int num) {
		System.out.println("Factor of " + num + " are: ");
		for(int i =1; i <= num; i++) {
			if(num % i == 0) {
				System.out.println(i + " ");
			}
		}
		System.out.println();//for a new line after printing all factor 
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Assignment7_3 assig = new Assignment7_3();
        
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		
		assig.printFactor(number);
		sc.close();
	}

}
