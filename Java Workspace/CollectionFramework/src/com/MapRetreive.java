package com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapRetreive {
	public static void main(String[] args) {
		Map<Integer, String> info = new HashMap<Integer, String>();
		info.put(2, "A");
		info.put(1, "B");
		info.put(3, "D");
		System.out.println(info);
		Set<Integer> ss = info.keySet();  // convert to set and store only keys 
		Iterator<Integer> li = ss.iterator();
		while(li.hasNext()) {
			int key = li.next();
			System.out.println("key is "+key+" VAlue "+info.get(key));
		}
	}
}
