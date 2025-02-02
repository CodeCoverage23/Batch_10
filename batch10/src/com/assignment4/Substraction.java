package com.assignment4;

public class Substraction {
	
	public int getSubstraction(int a,int b)
	{
		int c = a-b;
		return c;
	}

	public static void main(String[] args) {
		Substraction substraction = new Substraction();
		int sum = substraction.getSubstraction(20, 10);
		System.out.println("substraction of two number:"+sum);
		

	}

}
