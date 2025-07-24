package abstractkeyword;


abstract class Bike {
	abstract void speed();
	void mailage() {
		System.out.println("Generic Mailage : 50km/lt");
	}
}
class Pulsar extends Bike {
	void speed() {
		System.out.println("Pulsar Speed overrided method : 90km/hr");
	}
}
class Honda extends Bike {
	void mailage() {
		System.out.println("Mailage : 55km/lt");
	}
	void speed() {
		System.out.println("Honda Speed overrided method : 50km/hr");
	}
}
public class AbstractExample {
	public static void main(String[] args) {
		Honda hh = new Honda();
		hh.speed();
		Pulsar pu = new Pulsar();
		pu.speed();
		
	}

}
