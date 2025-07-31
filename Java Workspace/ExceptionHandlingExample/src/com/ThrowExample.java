package com;

import java.util.Scanner;

public class ThrowExample {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the age");
		int age = sc.nextInt();
		try {
		if(age>=21) {
			System.out.println("you can apply for Job");
		}else {
			//throw new Exception();		// generic exception without message
			//throw new Exception("age must be >=21 to apply job"); with custom message 
			//throw new JobConditionException();	//user defined exception 
			throw new JobConditionException("age must be >=21 to apply job");
		}
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}

}
