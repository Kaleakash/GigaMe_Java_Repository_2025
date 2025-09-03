package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

class MyConsumer implements Consumer<String>{
	@Override
	public void accept(String t) {
	System.out.println("Value is "+t);
	}
}
public class RetrieveValueFromCollection {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Ravi");names.add("Ajay");names.add("Vikash");names.add("Mahesh");
		System.out.println("using Iterator");
		Iterator<String> li = names.iterator();
		while(li.hasNext()) {
			String name = li.next();
			System.out.println(name);
		}
		System.out.println("Retreive the value using Myconsumer class");
		Consumer<String> cc1 = new MyConsumer();
		names.forEach(cc1);
		System.out.println("Using Lambda expression retreive the value");
		names.forEach(v->System.out.println("Value is "+v));
	}

}
