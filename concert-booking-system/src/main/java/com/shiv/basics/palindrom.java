package com.shiv.basics;

import java.util.Scanner;


public class palindrom {
	
	public static void main(String args[]){
		
		int n,temp,r,sum=0;
		
		System.out.println("Enter no");//121
		Scanner sc = new Scanner(System.in);
		
		n=sc.nextInt();
		temp = n; //121
		
		while(n>0){
			r=n%10; //r=1 //2 //1
			sum = (sum*10)+r; //1 //12 //121
			n=n/10; //n=12 //n=1 //n=0
			
					
		}
		if(temp == sum){
			System.out.println(temp+" is palindrom no");	
		}else{
			System.out.println(temp+" is not palindrom no");
			
		}
	}

}
