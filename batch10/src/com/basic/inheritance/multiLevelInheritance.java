package com.basic.inheritance;

class Animal{
	void eat(){
		System.out.println("Eating");
	}
}
class Cat extends Animal{
	void Meow(){
		System.out.println("Meowing..");
	}
}
class Dog extends Cat{
	void bark(){
		System.out.println("Barking..");
	}
}
public class multiLevelInheritance {

	public static void main(String[] args) {
		Dog i = new Dog();
		i.eat();
		i.Meow();
		i.bark();
		

	}

}