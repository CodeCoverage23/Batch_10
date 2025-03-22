package com.basic.Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		
		Map<Integer,String> map = new HashMap<>();
		
		System.out.println(map);
		
		map.put(11, "Pune");
		map.put(14, "Nagpur");
		map.put(19, "Mumbai");
		map.put(51, "Banglore");
		map.put(91, "Wadi");
		map.put(67, "Patna");
		map.put(34, "Wardha");
		map.put(23, "Akola");
		
		System.out.println(map);
		
//		System.out.println(map.isEmpty());
		
//		System.out.println(map.containsKey(50));
//		System.out.println(map.containsKey(51));
		
		map.replace(34, "Goa");
		
		for(Map.Entry<Integer,String> m: map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
			System.out.println(m.getKey());
			System.out.println(m.getValue());
		}
		
	}

}
