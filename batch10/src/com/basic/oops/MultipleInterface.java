package com.basic.oops;


interface A{
	String print();
}

interface B {
	String print();
}
public class MultipleInterface implements A,B {

public String print() {
	return "Code Coverage";
}
	
	public static void main(String[] args) {
		MultipleInterface i = new  MultipleInterface();
		System.out.println(i.print());
	}



}
