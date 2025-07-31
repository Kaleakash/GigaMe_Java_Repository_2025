package com;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi");
		try {
			int result = 100/1;
			System.out.println("no Exception");
		} catch (Exception e) {
			System.out.println("Catch block");
			// TODO: handle exception
		}finally {
			System.out.println("finally block");
		}
	}

}
