package com.shiva.oop;

public class Child extends Parent {

    public static void m2() {
        System.out.println("child static m1()");
    }
    
    
    public static void main(String[] args) {
    	Parent p = new Child();
    	p.m1();
    }
}
