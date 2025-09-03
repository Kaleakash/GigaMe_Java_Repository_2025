package com;
interface Sample {
	void sayHello();
}
//class SampleImp implements Sample {
//	@Override
//	public void sayHello() {
//	System.out.println("Provided body for sayHello method using SampleImp class");	
//	}
//}
public class SimpleLambdaExpessionExample {

	public static void main(String[] args) {
		// 1st way 
//		Sample s1 = new SampleImp();
//		s1.sayHello();
		
		// 2nd way : providing body for Sample interface using anonymous class. 
		Sample s2 = new Sample() {
			@Override
			public void sayHello() {
				System.out.println("Provided body for sayHello method using Anonymous class - 1st way");
			}
		};
		s2.sayHello();
		Sample s3 = new Sample() {
			@Override
			public void sayHello() {
				System.out.println("Provided body for sayHello method using Anonymous class - 2nd way");
			}
		};
		s3.sayHello();
		// 3rd way : proving the body for sayHello method using Lambda style 
		Sample s4 = ()->System.out.println("provided body for sayHello method using lambda style");
		s4.sayHello();
	}

}
