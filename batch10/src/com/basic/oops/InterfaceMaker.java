package com.basic.oops;

interface Z{
	void add();
}
public class InterfaceMaker {
public void add() {
	System.out.println(11+55);
}
	public static void main(String[] args) {
		InterfaceMaker I = new InterfaceMaker();
		I.add();
	}

}
