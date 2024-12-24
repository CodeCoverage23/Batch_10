package com.basic;

public class ConstructorChainingDemo {

	String cons;
	
	public ConstructorChainingDemo() {
		this("Parameter");
		System.out.println("Defalut");
	}
	public ConstructorChainingDemo(String cons) {
		this.cons = cons;
		System.out.println(cons);
	}
	public static void main(String[] args) {
		ConstructorChainingDemo c = new ConstructorChainingDemo();

	}

}
