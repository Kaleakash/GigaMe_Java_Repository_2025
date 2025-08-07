package waitandnotify;
class Task implements Runnable {
	@Override
	public synchronized void run() {
	Thread t = Thread.currentThread();
	String name = t.getName();
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(500);
				System.out.println(name+" "+i);
				if(name.equals("Raj") && i==4) {
					wait();
				}
				if(name.equals("Ravi") && i==8) {
					//notify();
					wait();
				}
				if(name.equals("Ramesh") && i==5) {
					notifyAll();
					//wait();
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}

public class SimpleWaitAndNotifyExample {

	public static void main(String[] args) {
	Runnable rr = new Task();
	Thread t1 = new Thread(rr,"Raj");
	Thread t2 = new Thread(rr,"Ravi");
	Thread t3 = new Thread(rr,"Ramesh");
	t1.start();
	t2.start();
	t3.start();
	}

}
