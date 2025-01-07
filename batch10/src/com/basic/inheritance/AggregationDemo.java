package com.basic.inheritance;


class opration{
	int sq(int n) {
		return n * n;
	}
}

class circle{
	opration op;
	double pi = 3.14;
	
	double area(int radius) {
		op = new opration();
		int rsq = op.sq(radius);
		return pi * rsq;
	}
	public static void main(String[] args) {
		circle c = new circle();
		double result = c.area(55);
		System.out.println(result);

	}

}