package com.basic.collection;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapDemo {

	public static void main(String[] args) {

		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();

		map.put("Goa", 3);
		map.put("Delhi", 5);
		map.put("Maharashtra", 11);
		map.put("MP", 2);

		System.out.println(map);

		map.putIfAbsent("Goa", 4);
		map.putIfAbsent("Gujrat", 6);

		map.remove("MP");

		System.out.println(map);

		Set<Entry<String, Integer>> entrySet = map.entrySet();

		Iterator<Entry<String, Integer>> iterator = entrySet.iterator();

		while (iterator.hasNext()) {
			Entry<String, Integer> entry = iterator.next();

			System.out.println(entry.getKey());
			System.out.println(entry.getValue());

		}

		System.out.println(map.keySet());
		System.out.println(map.values());

	}

}
