package com.shiv.patterns;

import java.util.Scanner;

public class StarEvenOdd {

	public static void main(String args[]) {
		
		 Scanner sc = new Scanner(System.in);
        
	        //Taking rows value from the user
	         
	        System.out.println("How many rows you want in this pattern?");
	         
	        int rows = sc.nextInt();
	         int j=0;
	         int i=0;
	        System.out.println("Here is your pattern....!!!");
	      //  System.out.println("*");
	        for (i = 1; i <= rows; i++)   
	        {  
	        //Prints first half of the row  
	        for (j = 1; j <= i; j++)   
	        {   
	        	if(j%2==0){  //for alternate printing
	        		System.out.print("$"+" "); 
	        	}else{
	        		 System.out.print("*"+" "); 
	        	}
	         
	        }  
	        //Prints second half of the row   
	        for (j = i-1; j >= 1; j--)  
	        {  
	        	if(j%2==0){
	        		System.out.print("$"+" "); 
	        	}else{
	        		 System.out.print("*"+" "); 
	        	}  
	        }  
	            System.out.println();
	        }
	         
	        //Closing the resources
	         
	        sc.close();
		
	}
}
