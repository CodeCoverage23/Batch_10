//3.write a program to find out maximum number among three number(if else if ladder

package com.assignment5;
import java.util.Scanner;
public class Que3 {
	
	static void max(int a,int b,int c) {
		if(a==b && a==c) {
			System.out.println("the numbers are equal please enterd valid input");
			
		}
		else if(a>b && a>c) {
			System.out.println("Maximum number is "+a);
		}
		else if(b>a && b>c) {
			System.out.println("Maximum number is "+b);
		}
		else {
			System.out.println("Maximum number is "+c);
		}
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the three numbers :");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	max(a,b,c);
}
}
