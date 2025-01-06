package com.basic.inheritance;


class Car{
	void Run(){
		System.out.println("Running");
	}
}
class Bike extends Car{
	void Pulser(){
		System.out.println("NS..");
	}
}
class Cycle extends Car{
	void BSA(){
		System.out.println("Thunder..");
	}
}
public class heiarchicalInheritace {
	public static void main(String[] args) {
		Bike i = new Bike();
		i.Pulser();
		i.Run();
		Cycle c = new Cycle();
		c.BSA();
		

	}
}


