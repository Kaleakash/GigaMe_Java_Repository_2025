package com;

import java.util.ArrayList;
import java.util.List;

public class CollectionWithGenerics {

	public static void main(String[] args) {
		// Collection framework without generics 
//		List ll1 = new ArrayList();
//		ll1.add(100);
//		ll1.add("Ravi");
//		ll1.add(10.10);
//		ll1.add(true);
//		
//		Object obj = ll1.get(0);
//		Integer i = (Integer)obj;
//		int n = i.intValue();
//		System.out.println(n);
		
		// Collection with generics 
		List<Integer> ll2 = new ArrayList<Integer>();
		ll2.add(10);	// auto - boxing : converting primitive to object. 
		ll2.add(20);
		ll2.add(30);
		
		int n = ll2.get(0);		// auto-unboxing : converting object to primitive 
		System.out.println(n);
		
		List<Object> ll3 = new ArrayList<Object>();
		ll3.add(100);
		ll3.add("Ravi");
		ll3.add(10.10);
		ll3.add(true);
	}

}
