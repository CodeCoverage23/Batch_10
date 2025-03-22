package com.basic.Collection;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMApDemo {

	public static void main(String[] args) {
		
		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
		map.put("Goa", 3);
		map.put("Delhi", 90);
		map.put("Pune", 36);
		map.put("Nagpur", 89);
		map.put("Patna", 56);
		
//		System.out.println(map);
//		
//		map.putIfAbsent("Mp", 4);		
//		System.out.println(map);
//		
//		map.putIfAbsent("Gujrat", 6);
//		System.out.println(map);
//		
//		map.remove("Mp");
//		System.out.println(map);
		
		
		Set<Entry<String,Integer>> entrySet= map.entrySet();
		
		Iterator<Entry<String,Integer>> iterator= entrySet.iterator();
		
		while (iterator.hasNext()) {
			Entry<String, Integer> entry = iterator.next();
			
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		System.out.println(map.keySet());
		System.out.println(map.values());
	}

}
