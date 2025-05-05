package com.java;

public class Singletone {
	private static Singletone instance;

	private Singletone() {

	}

//threadsafe
	public synchronized Singletone getInstance() {

		if (instance == null) {
			instance = new Singletone();
		}
		return instance;
	}
	// not synchronized
	public  Singletone getInstance1() {

		if (instance == null) {
			instance = new Singletone();
		}
		return instance;
	}
}
