package com;

public class DefaultThreadInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = Thread.currentThread();
		System.out.println(t);// thread number, thread name, priority and group 
		t.setName("My Thread");
		t.setPriority(1);// range of priority 1 to 10 
		System.out.println(t);
	}

}
