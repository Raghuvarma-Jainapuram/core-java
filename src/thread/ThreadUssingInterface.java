package thread;

class Thread1 implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread1:");
		for(int i=1;i<=5;i++) {
			System.out.println(i);
			try {
				Thread.sleep(3000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		
	}
	
}
class Thread2 extends Thread{
	public void run() {
		System.out.println("Thread2:");
		for(int i=6;i<=10;i++) {
			System.out.println(i);
		}
	}
}
class Thread3 extends Thread{
	public void run() {
		System.out.println("Thread3:");
		int num=9;
		for(int i=1; i<=10;i++) {
			System.out.println(num + " * " + i + " = " + (num*i));
		}
	}
}
public class ThreadUssingInterface {

	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread t = new Thread(t1);
		t.start();
		Thread2 t2 = new Thread2();
		t2.start();
		Thread3 t3 = new Thread3();
		t3.start();

	}

}
