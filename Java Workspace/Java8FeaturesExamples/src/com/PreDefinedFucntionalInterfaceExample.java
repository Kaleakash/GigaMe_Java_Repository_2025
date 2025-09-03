package com;

import java.util.function.Function;

class MyFunction implements Function<Integer, String>{
	@Override
	public String apply(Integer t) {
		return "You pass the number as "+t;
	}
}
public class PreDefinedFucntionalInterfaceExample {

	public static void main(String[] args) {
		Function<Integer, String> result1 = new MyFunction();
		System.out.println(result1.apply(100));
		
		System.out.println("using lambda expresion");
		Function<Integer, String> result2 = (value)->"You pass number as "+value;
		System.out.println(result2.apply(200));
	}

}
