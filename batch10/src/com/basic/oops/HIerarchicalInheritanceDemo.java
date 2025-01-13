package com.basic.oops;

class Dog1 extends Animal {
	void bark() {
		System.out.println("Barking...");
	}
}

class Cat extends Animal {
	void meow() {
		System.out.println("Meow...");
	}
}

public class HIerarchicalInheritanceDemo {

	public static void main(String[] args) {

		Cat c = new Cat();
		c.meow();
		c.eat();

		Dog1 d = new Dog1();
		d.bark();
		d.eat();

	}

}
