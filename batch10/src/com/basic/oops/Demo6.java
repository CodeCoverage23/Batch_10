package com.basic.oops;

interface Inter {

	void add();

}

public class Demo6 implements Inter {

	@Override
	public void add() {
		System.out.println(11 + 55);
	}

	public static void main(String[] args) {
		Demo6 d = new Demo6();
		d.add();
	}

}
