/*
* Assignment 10
* Program2
* Write a java program to display the Fibonacci series up to given number.
* (Fibonacci series mean next number is the sum of previous two numbers
* for example 0,1,1,2,3,5,8,13,21,34,55 etc. If enter no as 5 then output is 0,1,1,2,3).
*/

package Assignment10;
import java.util.Scanner; 
public class Que2 {

	public static void main(String args[]) 
			{   
		 Scanner s1 = new Scanner(System.in);    
	       System.out.print("Enter a number : ");    
	       int n = s1.nextInt(); 
	       int n1=5;
			int n2=n1+1,n3,i;   
			System.out.print(n1+" "+n2);  
			   
			for(i=2;i<n;i++)  
			{   
			  n3=n1+n2;   
			  System.out.print(" "+n3);   
			  n1=n2;   
			  n2=n3;   
			}   
			 }
	}


