package statickeyword;
class Abc {
	int a;			// instance variable 
	static int b;	// static variable 
	
	void dis1() {
		System.out.println("non static method");
	}
	static void dis2() {
		System.out.println("static method");
	}
}

public class StaticSimpleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abc obj = new Abc();
		obj.a=100;
		Abc.b=200;		// static variable 
		obj.dis1();
		Abc.dis2();    // static method 
		obj.b=300;		// static variable assign the value through object 
		obj.dis2();    // calling static method through object. 
	}

}
