package game;

class Car implements Runnable {
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		System.out.println(t);
//		for(int i=0;i<=10;i++) {
//			try {
//			Thread.sleep(1000);
//			}catch(Exception e) {}
//			System.out.println(name+" moving car with speed as "+(i+80));
//		}
	}
}
class Bike implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Thread t = Thread.currentThread();
		String name = t.getName();
	}
}

public class GameApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car cc = new Car();
		for(int i=0;i<20;i++) {
			Thread carPlayer1 = new Thread(cc);
			Thread carPlayer2 = new Thread(cc);
			Thread carPlayer3 = new Thread(cc);
		//carPlayer1.setName("Driver 1");
		//carPlayer2.setName("Driver 2");
		//carPlayer3.setName("Driver 3");
		carPlayer1.start();
		carPlayer2.start();
		carPlayer3.start();
		}
	}

}
