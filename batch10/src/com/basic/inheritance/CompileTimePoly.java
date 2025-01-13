package com.basic.inheritance;


class Compile{
public int add(int a,int b) {
	return a + b;
}
public int add(int a,int b,int c) {
	return a + b + c;
}
public  double divsion(double a,double b) {
	return a/b;
}
public  double divsion(int a,int b) {
	return a/b;
}
}
public class CompileTimePoly {

	public static void main(String[] args) {

		Compile c = new Compile();
		System.out.println(c.add(2, 3));
		System.out.println(c.add(2, 3, 4));
		System.out.println(c.divsion(4, 2));
		System.out.println(c.divsion(10, 2));
	}

	
	
}
