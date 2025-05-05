package com.shiv.arrays;

 public class Calculation {

	public static void main(String[] args) {
		
		System.out.println(add());
		System.out.println(add(10,20));
		System.out.println(add(10,20,10.5f));
		sub(50,20);

	}
	
	public static int add() {
		int a = 20,b=10;
		int sum = a+b; 
		return sum;
	}
	
	public static int add(int a,int b) {
		int sum = a+b;
		return sum;
	}
	
	public static int add(int a,int b, float c) {
		int sum = a+b;
		return sum;
	}
	public static int add(float c,int a,int b) {
		int sum = a+b;
		return sum;
	}
	
	public static int add(double c,int a,int b) {
		int sum = a+b;
		return sum;
	}
	
	public static void sub(int a, int b){
		System.out.println(a-b);
	}

}
