package com;

public class RuntimeError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi");
		int a=10;
		int b=1;
		try {
		int result1 = a/b;
		System.out.println("REsult is "+result1);
		int abc[]= {10,20,30,40};
		int result2 = abc[5];
		System.out.println("Result1 "+result2);
		}catch(Exception e) {
			//System.out.println("I Take Care!");
			//System.out.println(e.getMessage());  // short error message 
			System.out.println(e.toString()); // name of the exception and message 
		}
		System.out.println("Bye...");
		System.out.println("Bye...");
		System.out.println("Bye...");
	}

}
