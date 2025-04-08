package com.basic.oops;


class Animal{
	void eat() {
		System.out.println("Eating..");
	}
}
class dog1 extends Animal{
	void bark() {
		System.out.println("Barking");
	}
}

class cat extends Animal{
	void meow() {
		System.out.println("Meow..");
	}
}

public class HiearchicalInheritanceDemo {

	public static void main(String[] args) {
cat c = new cat();
c.meow();
c.eat();

dog1 d = new dog1();
d.bark();
d.eat();
	}

}
