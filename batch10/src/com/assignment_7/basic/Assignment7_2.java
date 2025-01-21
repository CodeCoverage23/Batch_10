package com.assignment_7.basic;

import java.util.Scanner;

/*2. Design method public int getNumberCube(int num), 
 * return int value to that method and result should be into main method.
 */

public class Assignment7_2 {
	
	//method to calculate the cube of a number
		public int getNumberCube(int num) {
			return num * num * num;
		}

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			Assignment7_2 assig = new Assignment7_2();
			
			System.out.println("Enetr a number: ");
			int num = sc.nextInt();
			sc.close();
			
			int result = assig.getNumberCube(num);
			System.out.println("The cube of " + num + " is: " + result);
			

		}

	}

