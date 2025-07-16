package com;

public class Car {

	String colour;
	float price;
	int wheel;			// instance variable. 
		
	Car() {
		System.out.println("object created");
		this.wheel=4;
		this.price=1000000;
		this.colour="Unknown";
	}
	Car(int wheel, float price, String colour) {
		System.out.println("object created");
		this.wheel=wheel;
		this.price=price;
		this.colour=colour;
	}
	void start() {
		System.out.println("Car Start");
	}
	void appliedGear() {
		System.out.println("Aplied Gear");
	}
	void moving() {
		System.out.println("Car is moving");
	}
	void stop() {
		System.out.println("Car Stop");
	}
	
//	void setValue(String colour1,float price1,int wheel1) {	// local variable (parameter variable )
//			colour=colour1;		// instance = local
//			price=price1;
//			wheel=wheel1;
//	}
	void setValue(String colour,float price,int wheel) {	// local variable (parameter variable )
		this.colour=colour;
		this.price=price;
		this.wheel=wheel;
	}
	void displayCarInfo(String name) {
		String msg="Car Details :"+name;
		System.out.println(msg);
		System.out.println("Colour "+colour);
		System.out.println("Price "+price);
		System.out.println("Wheel "+wheel);
	}
}
