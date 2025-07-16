package com;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//start();
//		Car bmw = new Car();	// created memory 
//		Car innova = new Car();
//		Car santro = new Car();
//		bmw.start();
//		bmw.stop();
//		innova.start();
//		innova.stop();
//		
//		santro.start();
//		santro.stop();
		
//		Car innova = new Car();
//		//innova.displayCarInfo();			// default value 
////		innova.wheel=4;
////		innova.price=3500000;
////		innova.colour="White";
//		innova.setValue("White", 3800000, 4);
//		innova.displayCarInfo("Innova");			// updated value 
//		System.out.println("-----------------");
//		Car ertiga = new Car();
//		//ertiga.displayCarInfo();
////		ertiga.price=1500000;
////		ertiga.colour="Gray";
////		ertiga.wheel=4;
//		ertiga.setValue("Gray", 1300000, 4);
//		ertiga.displayCarInfo("Ertiga");
		
//		// constructor example : empty constructor 
//		Car innova = new Car();
//		innova.displayCarInfo("Innova");
//		System.out.println("-----------------");
//		Car ertiga = new Car();
//		ertiga.displayCarInfo("Ertiga");
		
		// constructor example : parameter constructor 
		Car innova = new Car(4,3800000,"White");
		new Car(4,3800000,"White");		// new memory created..
		innova.displayCarInfo("Innova");
		System.out.println("-----------------");
		Car ertiga = new Car(4,1500000,"Gray");
		ertiga.setValue("Gray", 1300000, 4);
		ertiga.setValue("Gray", 1100000, 4);
		ertiga.displayCarInfo("Ertiga");
		
	}

}
