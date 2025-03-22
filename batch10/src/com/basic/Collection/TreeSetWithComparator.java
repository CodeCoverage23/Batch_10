package com.basic.Collection;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetWithComparator {

	public static void main(String[] args) {
		
		TreeSet<Integer> t = new TreeSet<Integer>(new MyComparator1());
		
		for(int i=1;i<=10;i++) {
			t.add(i * 10);
		}
		
		System.out.println(t);

	}

}

class MyComparator1 implements Comparator<Integer>{
	@Override
	public int compare(Integer o1,Integer o2) {
		if(o1<o2) 
			return 1;
		else if(o1>o2)
			return -1;
		else
			return 0;
		
	}
}
