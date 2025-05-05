package com.java8featuresademo.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsDemo {

	public static void main(String[] args) {
		List<Integer> arList = new ArrayList<>();
		arList.add(4);
		arList.add(29);
		arList.add(21);
		arList.add(6);
		arList.add(7);
		arList.add(7);
		arList.add(21);
		//with java 8
		Set<Integer> result = arList.stream().filter(w -> w>10).collect(Collectors.toSet());
		//arList.stream().map(a->a*a).forEach(y->System.out.println(y));
		
		arList.stream().distinct().forEach(y->System.out.println(y));
		//without stream
		/*List<Integer> result=findElements(arList);
		for(Integer i:result){
			System.out.println(i);
		}*/
	}
	
	/*public static List<Integer> findElements(List<Integer> arList){
		List<Integer> newAL = new ArrayList<>();
		for(Integer i:arList){
			if(i>10){
				newAL.add(i);
			}
		}
		return newAL;
		
	}*/

}
