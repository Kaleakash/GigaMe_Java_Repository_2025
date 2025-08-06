package booking;

class TicketBook implements Runnable{
	int avl =2;
	
	@Override
	public synchronized  void run() {
		// TODO Auto-generated method stub
		Thread t = Thread.currentThread();
		String name =t.getName();
		if(avl>0) {
			System.out.println(name+" got the ticket");
			avl=avl-1;
		}else {
			System.out.println(name+" sorry no ticket");
		}
	}
}
public class BookingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicketBook tb1 = new TicketBook();	// heap memory : avl 2
		//TicketBook tb2 = new TicketBook();	// heap memory : avl 2
		//TicketBook tb3 = new TicketBook();	// heap memory : avl 2
		Thread t1 = new Thread(tb1,"Raj");
		Thread t2 = new Thread(tb1,"Raju");
		Thread t3 = new Thread(tb1,"Ajay");
		Thread t4 = new Thread(tb1,"Vjay");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
