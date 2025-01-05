package com.Assign5;

import java.util.Scanner;

public class Que8 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the First number :");
	int a = sc.nextInt();	
	System.out.println("Enter the Second number :");
	int b = sc.nextInt();	
	
		int c;
		
		c = a;
		a = b;
		b = c;
		System.out.println(a);
		System.out.println(b);
	 

}}
