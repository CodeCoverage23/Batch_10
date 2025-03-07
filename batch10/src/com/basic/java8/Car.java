package com.basic.java8;

interface Car {

	void capacity();

	void fual();

	void mileage();

	default void charge() {

	}

	static void range() {

	}

}
