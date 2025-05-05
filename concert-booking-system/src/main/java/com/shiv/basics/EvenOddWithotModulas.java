package com.shiv.basics;

import java.util.Scanner;

public class EvenOddWithotModulas {

	public static void main(String args[]) {
		
		 Scanner sc = new Scanner(System.in);
       
	        
	         
	        System.out.println("Enter no?");
	         
	        int no = sc.nextInt();
	        
	        if(no/2*2==no)
	        	 System.out.println("Even");
	        else
	        	System.out.println("odd");
	}
}
