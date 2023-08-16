package thread;

class Test { 
	synchronized public void countIncrement() { 
		System.out.println("Increment values");
		for (int i = 0; i < 5; i++) { 
			System.out.println(i); 
			try { 
				Thread.sleep(400); 
			} 
			catch (Exception e) { 
				System.out.println(e); 
			} 
		} 
	} 
	synchronized public void countDecrement() { 
		System.out.println("Decrement values");
		for (int i = 5; i > 0; i--) { 
			System.out.println(i); 
			try { 
				Thread.sleep(400); 
			} 
			catch (Exception e) { 
				System.out.println(e); 
			} 
		} 
	} 
} 

class MyThread extends Thread { 

	Test test; 

	MyThread (Test test) { 
		this.test = test; 
	} 

	@Override
	public void run() { 
		test.countIncrement(); 
		test.countDecrement();
	} 
} 

public class SynchronizedExIncreAndDecreOfi {
	public static void main(String[] args) { 
		Test obj = new Test(); //Object of Apple class that is shared amoung threads

		MyThread thread1 = new MyThread(obj); 
		MyThread thread2 = new MyThread(obj); 

		thread1.start(); 
		thread2.start(); 
	} 
} 
