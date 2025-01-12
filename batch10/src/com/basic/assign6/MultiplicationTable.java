package com.basic.assign6;
import java.util.Scanner;
public class MultiplicationTable {

	
	
		 public static void multiplication(int no) {
		        int i = 1;
		        while (i <= 10) {
		            System.out.println(no + " * " + i + " = " + (no * i));
		            i++;
		        }
		    }

		    public static void main(String[] args) {
		    
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter a number: ");
		        int num = scanner.nextInt(); 
		        multiplication(num);  
		        scanner.close();
		    }
		    
	}


