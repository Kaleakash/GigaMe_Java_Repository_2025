package runandcall;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Task1 implements Runnable {
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println("This is run thread "+t);
	}
}
class Task2 implements Callable<String>{
	@Override
	public String call() throws Exception {
		Thread t = Thread.currentThread();
		//System.out.println("This is call thread "+t);
		return "I done thread task "+t.toString();
	}
}
public class ExampleWithRunAndCall {
	public static void main(String[] args) throws Exception {
	//1st option 
//	ExecutorService es 	= Executors.newSingleThreadExecutor();
//	//ExecutorService es 	= Executors.newFixedThreadPool(2);	
//	Runnable r1 = new Task1();
//	Callable<String> c1 = new Task2();
//	es.submit(r1);		// submit is like a start 
//	Future<String> ff= es.submit(c1);		// submit is like a start 
//	System.out.println("main method "+ff.get());
		
	// 2nd options 			
//		ExecutorService es 	= Executors.newFixedThreadPool(20);
//		Callable<String> c1 = new Task2();
//		for(int i=0;i<20;i++) {
//			Future<String> ff= es.submit(c1);		// submit is like a start 
//			System.out.println("main method "+ff.get());
//		}
		
		// 3rd options 			
		ExecutorService es 	= Executors.newCachedThreadPool();
		Callable<String> c1 = new Task2();
		for(int i=0;i<20;i++) {
			Future<String> ff= es.submit(c1);		// submit is like a start 
			System.out.println("main method "+ff.get());
		}
		
		//es.shutdown();
	}

}
