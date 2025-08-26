package com;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListRetrieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = new ArrayList<String>();
		names.add("Akash"); names.add("Vikash"); names.add("Prakash");
		System.out.println(names);
		System.out.println("names in forward direction");
		ListIterator<String> li1 = names.listIterator();
		while(li1.hasNext()) {
			String name = li1.next();
			System.out.println(name);
		}
		System.out.println("names in backward direction");
		while(li1.hasPrevious()) {
			String name = li1.previous();
			System.out.println(name);
		}
	}

}
