package com.basic.inheritance;


class parent{
	public void marry() {
		System.out.println("Marry shantabai");
	}
}
class child extends  parent{
	public void marry() {
		System.out.println("Marry Katrina");
	}
}
class additon{
	void add(int a, int b) {
		System.out.println(a+b);
	}
}
class multiply extends additon{
	void add(int a, int b) {
		System.out.println(a*b);
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		child c = new child();
		c.marry();
		additon a= new multiply();
		a.add(2,3);
		
		

	}

}
