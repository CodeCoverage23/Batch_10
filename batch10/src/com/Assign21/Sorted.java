package com.Assign21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Assignments 21
//1. Design the method which return the list that contain the element as Ram, Sohan, Ashok, Ajay, Prasanna now I want to sort that element based on descending order.

public class Sorted {

	public List<String> getListElements(){
		List<String> list = new ArrayList<String>();
		list.add("Ram");
		list.add("Sohan");
		list.add("Ashok");
		list.add("Ajay");
		list.add("Prasanna");
		
		return list;
	}
	
	public static void main(String[] args) {
		Sorted s = new Sorted();
		
		List<String> ascendingList = s.getListElements();
		Collections.sort(ascendingList);
		System.out.println("List In Ascending Order>>" + ascendingList);
		
		System.out.println("List In Descending Order>>");
		for(int i = ascendingList.size() -1;i>=0;i--) {
			System.out.println(ascendingList.get(i) + " ");
		}
	}

}
