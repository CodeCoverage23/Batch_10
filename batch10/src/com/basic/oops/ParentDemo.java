package com.basic.oops;

public class ParentDemo {
	int a,b;
	
	void show() {
		
	}
	
	void add(int a,int b) {
		this.a=a;
		this.b=b;
//		System.out.println(a+b);
		System.out.println(this.a+this.b);
	}
	
	public static void main(String[] args) {
		FinalKeyword F = new FinalKeyword();
		F.add(2,3);

	}

}
