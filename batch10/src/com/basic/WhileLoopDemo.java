package com.basic;

import java.util.Scanner;

public class WhileLoopDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to print the table :");
		int num = sc.nextInt();
		int i = 1;
		while (i <= 10) {
			int b = num * i;
			System.out.println(b);
			i++;
		}

		// infinite while loop

		while (true) {
			System.out.println("infinite while loop...");
			System.out.println(i++);
		}

	}

}
