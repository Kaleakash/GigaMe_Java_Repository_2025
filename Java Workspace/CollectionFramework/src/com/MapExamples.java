package com;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExamples {

	public static void main(String[] args) {
		//Map mm = new HashMap();
		//Map mm = new LinkedHashMap();
		Map mm = new TreeMap();
		mm.put(3, "Ravi");
		mm.put(1, "Ramesh");
		mm.put(4, "Raj");
		mm.put(7, "Ramu");
		//mm.put("a", "b");
		System.out.println(mm);
	}

}
