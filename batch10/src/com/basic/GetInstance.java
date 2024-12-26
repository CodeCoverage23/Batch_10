package com.basic;

public class GetInstance {

	public GetInstance getInstance() {
		return this;
	}

	public static void main(String[] args) {

		GetInstance g = new GetInstance();

		System.out.println(g.getInstance());

	}

}
