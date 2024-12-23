package com.basic;

 class Student {
	
int id;
String name;
int roll_num;

Student(int i , String n , int r){
	id = i;
	name = n;
	roll_num =  r;
}

void display() {
	System.out.println(id + " " + name + " " + roll_num);
}
	public static void main(String[] args) {
		Student s1 = new Student (1,"Tushar",20);
				Student s2 = new Student (2,"Kant",21);
s1.display();
		s2.display();
	}

}
