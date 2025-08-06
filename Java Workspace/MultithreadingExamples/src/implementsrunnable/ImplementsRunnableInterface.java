package implementsrunnable;

class Task1 implements Runnable{// this interface contains only one method ie run and it is abstract 
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		for(int i=0;i<5;i++) {
			System.out.println(name+" "+i);
		}
	}
}
class Task2 implements Runnable{
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		for(int j=0;j<5;j++) {
			System.out.println(name+" "+j);
		}
	}
}
public class ImplementsRunnableInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Task1 t1 = new Task1();
//		Task2 t2 = new Task2();
//		t1.run();
//		t2.run();
		Runnable r1 = new Task1();
		Runnable r2 = new Task2();
		
		Thread tt1 = new Thread(r1);		// create thread class object and pass the reference of that class the class implements runnable 
		Thread tt2 = new Thread(r2);
		tt1.setName("Ravi");
		tt2.setName("Raju");
		tt1.start();
		tt2.start();
	}

}
