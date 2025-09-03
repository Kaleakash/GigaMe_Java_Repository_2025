package com;
@FunctionalInterface
interface Hello {
	void display1();		// abstract method 
	default void display2() {
		System.out.println("display2 default method part of Hello interface");
	}
	default void display3() {
		System.out.println("display3 default method part of Hello interface");
	}
	static void display4() {
		System.out.println("display3 static method part of Hello interface");
	}
		
}
class HelloImp implements Hello {
	@Override
	public void display1() {
	System.out.println("helloImp class provided body for display1 abstract method");	
	}
	@Override
	public void display2() {
		System.out.println("HelloImp class overrided display2 default method");
	}

}
public class DefaultAndStaticInterfaceExample {

	public static void main(String[] args) {
		HelloImp h1 = new HelloImp();
		h1.display1();
		h1.display2();
		h1.display3();
		Hello.display4();   // static method part of interface need to call using interface name
	}

}
