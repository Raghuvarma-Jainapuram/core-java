package thread;


class MultiThread extends Thread{
	public void run() {
		System.out.println("Running Thread Name: "+Thread.currentThread().getName());
		System.out.println("Running Thread Priority: "+Thread.currentThread().getPriority());
	}
}
public class ThreadEx {

	public static void main(String[] args) {
		MultiThread multiTrd1 = new MultiThread();
		multiTrd1.setName("First Thread");
		multiTrd1.setPriority(Thread.MIN_PRIORITY);
		
		MultiThread multiTrd2 = new MultiThread();
		multiTrd2.setName("Second Thread");
		multiTrd2.setPriority(Thread.MAX_PRIORITY);
		
		MultiThread multiTrd3 = new MultiThread();
		multiTrd3.setName("Third Thread");
		
		multiTrd1.start();
		multiTrd2.start();
		multiTrd3.start();
	}

}
