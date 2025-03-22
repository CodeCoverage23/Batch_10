package com.basic.Collection;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new TreeMap<>();
		
		map.put(41, "Pune");
		map.put(34, "Mumbai");
		map.put(68, "Goa");
		map.put(98, "Nagpur");
		map.put(10, "Patna");
		
		System.out.println(map);

	}

}
