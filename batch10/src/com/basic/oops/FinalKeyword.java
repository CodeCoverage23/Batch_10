package com.basic.oops;

class cal{
	final void show() {
		System.out.println("Showing...");
	}
	void add() {
		System.out.println("Adding...");
	}
}

class AdvCal extends cal{
//	void show() {
//		System.out.println("Advance...");
//	}
}


public class FinalKeyword {
	public static void main(String[] args) {
		AdvCal A = new AdvCal();
		A.show();
		A.add();
	}

}
