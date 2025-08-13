package com;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetClasses {

	public static void main(String[] args) {
		// 1st Example with HashSet 
//		HashSet hs = new HashSet();
//		System.out.println("Size is "+hs.size());
//		hs.add(10);
//		hs.add(10.20);
//		hs.add("Ravi");
//		hs.add(true);
//		System.out.println("Size is "+hs.size());
		
//		// 2nd Example with HashSet 
//		HashSet hs = new HashSet();
//		System.out.println("Size is "+hs.size());
//		System.out.println("Empty or not "+hs.isEmpty());
//		hs.add(3);
//		hs.add(1);
//		hs.add(20);
//		hs.add(7);
//		hs.add("Ravi");
//		hs.add(5);
//		hs.add(3);		// duplicate 
//		System.out.println("Added or not "+hs.add(9));
//		System.out.println("Added or not "+hs.add(1));
//		System.out.println("Size is "+hs.size());
//		System.out.println("Empty or not "+hs.isEmpty());
//		System.out.println(hs);    // it display output as string format. 
//		System.out.println("Search "+hs.contains(3));
//		System.out.println("Search "+hs.contains(100));
//		System.out.println("remove element using value "+hs.remove(7));
//		System.out.println("remove element using value "+hs.remove(77));
//		System.out.println(hs);    // it display output as string format. 
		
		// 3rd Example with LinkedHashSet 
//				LinkedHashSet hs =new LinkedHashSet();
//				System.out.println("Size is "+hs.size());
//				System.out.println("Empty or not "+hs.isEmpty());
//				hs.add(3);
//				hs.add(1);
//				hs.add(20);
//				hs.add(7);
//				hs.add("Ravi");
//				hs.add(5);
//				hs.add(3);		// duplicate 
//				System.out.println("Added or not "+hs.add(9));
//				System.out.println("Added or not "+hs.add(1));
//				System.out.println("Size is "+hs.size());
//				System.out.println("Empty or not "+hs.isEmpty());
//				System.out.println(hs);    // it display output as string format. 
//				System.out.println("Search "+hs.contains(3));
//				System.out.println("Search "+hs.contains(100));
//				System.out.println("remove element using value "+hs.remove(7));
//				System.out.println("remove element using value "+hs.remove(77));
//				System.out.println(hs);    // it display output as string format. 
		
		// 3rd Example with LinkedHashSet 
		TreeSet hs =new TreeSet();
		System.out.println("Size is "+hs.size());
		System.out.println("Empty or not "+hs.isEmpty());
		hs.add(3);
		hs.add(1);
		hs.add(20);
		hs.add(7);
		//hs.add("Ravi");
		hs.add(5);
		hs.add(3);		// duplicate 
		System.out.println("Added or not "+hs.add(9));
		System.out.println("Added or not "+hs.add(1));
		System.out.println("Size is "+hs.size());
		System.out.println("Empty or not "+hs.isEmpty());
		System.out.println(hs);    // it display output as string format. 
		System.out.println("Search "+hs.contains(3));
		System.out.println("Search "+hs.contains(100));
		System.out.println("remove element using value "+hs.remove(7));
		System.out.println("remove element using value "+hs.remove(77));
		System.out.println(hs);    // it display output as string format. 
	}

}
