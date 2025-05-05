package com.shiv.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		
		Map map = new HashMap();
		
		map.put(1, "shiv");
		map.put("kl", 5);
		
		//Set s = map.entrySet();
		Set s = map.keySet();
		
		Iterator itr = s.iterator();
		
		while(itr.hasNext()){
			//we can directly print whith out cnverting in to entry
			//System.out.print(itr.next()+",");
			//Converting to Map.Entry so that we can get key and value separately  
			Map.Entry entry = (Map.Entry)itr.next();
			
			System.out.print(entry.getKey()+" "+entry.getValue());
		}
	}

}
