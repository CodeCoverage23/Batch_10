package com.assignment4;

public class Division {
	
	public int getDivision(int a, int b)
	
	{
		int c = a/b;
		return c;
	}

	public static void main(String[] args) {
		Division division = new Division();
		int sum = division.getDivision(20,10);
		System.out.println("division of two number:"+sum);

	}

}
