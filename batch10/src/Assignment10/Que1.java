/*
* Assignment 10
* Program-1
* Write java program to check whether number is prime or not(Prime number
* means which is divisible by two numbers only i.e. 1 and itself only.
* if any number is divisible by any other number except mentioned then
* its not prime number.
*/

package Assignment10;
import java.util.Scanner; 
public class Que1 {
	  
		 public static void main(String args[])
		 {   
			 Scanner s1 = new Scanner(System.in);    
		       System.out.print("Enter a number : ");    
		       int n = s1.nextInt(); 
		  int i,
		  x=0,
		  y=0;      
		    
		  x=n/2;      
		  if(n==0||n==1){  
		   System.out.println(n+" is not prime number");      
		  }else{  
		   for(i=2;i<=x;i++){      
		    if(n%i==0){      
		     System.out.println(n+" is not prime number");      
		     y=1;      
		     break;      
		    }      
		   }      
		   if(y==0)  {
			   System.out.println(n+" is prime number"); }  
		  }  
		}    
		}   

