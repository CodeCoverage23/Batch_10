package com.shiv.map;

import java.util.HashMap;
import java.util.Map;

public class MapGeneric {

	public static void main(String[] args) {
		
		Map<Integer,String> m = new HashMap<Integer,String>();
		
		m.put(1, "Shiva");
		m.put(2, "pavan");
		m.put(3, "dipak");
		m.put(1, "swapnil");
		
		for(Map.Entry map:m.entrySet()){
			System.out.println(map.getKey()+" "+map.getValue());
		}
		
		/* //Returns a Set view of the mappings contained in this map        
	      map.entrySet()  
	      //Returns a sequential Stream with this collection as its source  
	      .stream()  
	      //Sorted according to the provided Comparator  
	      .sorted(Map.Entry.comparingByKey())  
	      //Performs an action for each element of this stream  
	      .forEach(System.out::println);  */
	}
}
