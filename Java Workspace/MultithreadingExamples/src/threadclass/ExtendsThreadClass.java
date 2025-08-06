package threadclass;
class Task1 extends Thread{
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		for(int i=0;i<5;i++) {
			System.out.println(name+" "+i);
		}
	}
}
class Task2 extends Thread{
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		for(int j=0;j<5;j++) {
			System.out.println(name+" "+j);
		}
	}
}
public class ExtendsThreadClass {

	public static void main(String[] args) {
		Task1 t1 = new Task1();
		Task2 t2 = new Task2();
		
		Task1 t3 = new Task1();
		Task2 t4 = new Task2();		// thread object created. 
		t1.setName("1st Thread");
		t2.setName("2nd Thread");
		t3.setName("3rd Thread");
		t4.setName("4th Thread");
		t1.start();				// ready to run ie Runnable state 
		t2.start();
		t3.start();
		t4.start();
	}

}
