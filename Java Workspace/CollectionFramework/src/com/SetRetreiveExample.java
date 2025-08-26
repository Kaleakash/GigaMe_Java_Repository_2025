package com;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetRetreiveExample {

	public static void main(String[] args) {
		Set<Integer> ss1 =new HashSet<Integer>();
		ss1.add(10); ss1.add(50);ss1.add(30);ss1.add(90);ss1.add(70);
		System.out.println(ss1);
		System.out.println("Retreive the element one by one using for each");
		for(int n :ss1) {
			System.out.println(n);
		}
		System.out.println("retreive the element one by one using iterator");
		Iterator<Integer> li = ss1.iterator();
		while(li.hasNext()) {
			int n = li.next();
			System.out.println(n);
			
		}
	}

}
