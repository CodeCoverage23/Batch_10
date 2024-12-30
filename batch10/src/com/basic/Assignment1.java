package com.basic;

import java.util.Scanner;

//public class Assignment1 {
//
//	public static void main(String[] args) {
//		int num = 25;
//		
//		while(num <=50) {
//			System.out.println(num);
//			num++;
//		}
//
//	}
//
//}


//public class Assignment1 {
//
//	public static void main(String[] args) {
//		int i = 25;
//		
//		while(i <= 75) {
//			if(i % 2 == 0) {
//				System.out.println(i);
//			}
//			i++;
//		}
//
//	}
//
//}


//public class Assignment1 {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the number to print the table :");
//		int num = sc.nextInt();
//		int i = 1;
//		
//		while(i<=10) {
//			int b = num*i;
//			System.out.println(b);
//			i++;
//		}
//
//	}
//
//}


public class Assignment1 {


	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	       
	        System.out.print("Enter a number to find its factorial: ");
	        int number = scanner.nextInt();
	        
	        
	        long factorial = 1;
	        

	        for (int i = 1; i <= number; i++) {
	            factorial *= i;  // Multiply factorial by i
	        }
	        
	  
	        System.out.println("Factorial of " + number + " is: " + factorial);
	        
	     
	    }
	}



