package polymorphism;
class Bike {
	void speed() {
		System.out.println("Generic Speed : 60km/hr");
	}
}
class Pulsar extends Bike {
	void mailage() {
		System.out.println("Mailage : 40km/lt");
	}
	void speed() {
		System.out.println("Pulsar Speed : 90km/hr");
	}
}
class Honda extends Bike {
	void mailage() {
		System.out.println("Mailage : 55km/lt");
	}
}
public class MethodOverridingExample {
	public static void main(String[] args) {
		Honda hh  = new Honda();
		hh.mailage(); hh.speed();
		Pulsar pu = new Pulsar();
		pu.mailage(); pu.speed();
	}

}
