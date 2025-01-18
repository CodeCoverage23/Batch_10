package com.basic.oops;

public class Person {
private String name;
private int age;
private String address;
private int mobileNumber;


public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getMobileNumber() {
	return mobileNumber;
}
public void setMobileNumber(int mobileNumber) {
	this.mobileNumber = mobileNumber;
}
@Override
public String toString() {
	return "Person [name=" + name + ", age=" + age + ", address=" + address + ", mobileNumber=" + mobileNumber + "]";
}



}
