package com.assign5;
import java.util.Scanner;
public class SwapNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);
		        
		        
		        System.out.print("Enter the first number: ");
		        int num1 = scanner.nextInt();
		        
		        System.out.print("Enter the second number: ");
		        int num2 = scanner.nextInt();
		        
		        
		        System.out.println("Before swapping: ");
		        System.out.println("First number: " + num1);
		        System.out.println("Second number: " + num2);
		        
		     
		        int temp = num1;  
		        num1 = num2;      
		        num2 = temp;      
		        
		       
		        System.out.println("After swapping: ");
		        System.out.println("First number: " + num1);
		        System.out.println("Second number: " + num2);
		      
		        scanner.close();
		    }
		

	}

