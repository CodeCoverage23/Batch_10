package com.shiv.basics;

import java.util.Scanner;


public class fact {

	public static void main(String args[]) {
		
		 Scanner sc = new Scanner(System.in);
         
	         
	        int no = 0;
	        int fact = facto(no);
	        System.out.println(fact);
	        
	       		
	}
	 public static int facto(int n){
	       /* if(n==0){
	        	return 1;
	        }*/
	        int fact1 = 1;
	        for(int i = 1;i<=n;i++){
	        	fact1 = fact1*i;
	        }
	        return fact1;
	        }
}

