package com;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack ss = new Stack();
		ss.push(100);
		ss.push(200);
		ss.push(300);
		ss.push(400);
		System.out.println(ss);
		System.out.println("remove top most element "+ss.pop());
		System.out.println(ss);
		System.out.println("retrieve top most element "+ss.peek());
		System.out.println(ss);
		System.out.println("search "+ss.search(200));// from top index start from 1
		System.out.println("search "+ss.search(3000));// if not return -1
	}

}
