package com.basic;

public class Division {
	
	public static int divNumbers(int a, int b) {
		if(b == 0) {
			
			System.out.println("exception occure divide by zero :");
			return 0;
		}
		return a/b;
	}
		public static void main(String[] args) {
			
	int a = 10;
	int b = 5;
	int Div = divNumbers(a,b);


	System.out.println("The division of "+a+" and " +b+" is :" +Div);
		}

}
