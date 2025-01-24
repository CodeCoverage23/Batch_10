package com.basic.oops;

public class TestPerson {

	public static void main(String[] args) {

		Person p = new Person();
		p.setAddress("Akola");
		p.setAge(22);
		p.setName("Kishor");
		p.setMobileNumber(88888888888L);

		System.out.println(p);

		Person p1 = new Person();
		p1.setAddress("Pune");
		p1.setAge(25);
		p1.setName("Ashutosh");
		p1.setMobileNumber(99999999999L);

		System.out.println(p1);

	}
	

}
