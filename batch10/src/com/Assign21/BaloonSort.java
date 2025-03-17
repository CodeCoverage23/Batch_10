package com.Assign21;

import java.util.LinkedList;

//2.Suppose I have one container that contain  different colors of ballons such as Red, Blue, Green, Red,Blue,Red, Blue, Green in this order, now sort that baloon in such manner so Red baloon will be added first then Blue baloon and last is Green balloons. Use the proper collection.

public class BaloonSort {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Red");
		list.add("Blue");
		list.add("Green");
		list.add("Red");
		list.add("Blue");
		list.add("Red");
		list.add("Blue");
		list.add("Green");
		LinkedList<String> list2 = new LinkedList<String>();
		System.out.println("Elements in List Container>>");
		System.out.println(list);
		for(String str : list) {
			if(str.equals("Red")) {
				list2.addFirst("Red");
			}
			else if (str.equals("Blue")) {
				list2.add("Blue");
			}
		}
		for(String str : list) {
			if(str.equals("Green")) {
				list2.add("Green");
			}
		}
		System.out.println("Output :");
		System.out.println(list2);
	}

}
