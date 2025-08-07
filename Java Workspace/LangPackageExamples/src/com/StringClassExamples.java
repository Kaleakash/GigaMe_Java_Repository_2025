package com;

public class StringClassExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Welcome to Java";  // creating using literal style 
		String str2 = new String("Welcome to Java");	//using new keyword 
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		System.out.println(str1.substring(1));
		System.out.println(str1.substring(1, 5));
		System.out.println("--------------------");
		String name1 = "Ravi";		// fresh memory created.
		String name2 = "Ravi";		// name1 and name2 link to same memory string pooling 
		String name3 = new String("Ravi");	// new memory 
		String name4 = new String("Ravi");	// new memory 
		System.out.println(name2);
		name2 = "Ravi Kumar";
		
		System.out.println(name2);
		System.out.println(name2.toUpperCase());
		System.out.println(name2);
		System.out.println("string buffer or string builder");
		StringBuffer sb = new StringBuffer("Ravi");
		System.out.println(sb);
			System.out.println(sb.append(" Kumar"));
			sb.reverse();
		System.out.println(sb);
	}

}
