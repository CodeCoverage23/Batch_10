package com.basic.inheritance;


class Fish{
	void eat(){
		System.out.println("Eating");
	}
}
class Goat extends Fish{
	void ship(){
		System.out.println("Shipping");
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		Goat i = new Goat();
		i.eat();
		i.ship();
		

	}

}
