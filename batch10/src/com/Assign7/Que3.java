package com.Assign7;

public class Que3 {
	public  void factor(int num) {
	for(int i =1 ; i<=num ;i++) {
		if(num % i == 0) {
			System.out.println(i);
		}
	}
	}
	public static void main(String[] args) {
		Que3 op = new Que3();
		op.factor(8);
	}
}

