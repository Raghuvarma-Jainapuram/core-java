package thread;
import java.util.Scanner;
class EvenNumbers extends Thread{
	@Override
	public void run() {
		System.out.println("Even Number Upto 20: ");
		for(int i=1; i<=20; i++) {
			if(i%2 == 0) {
				System.out.print(i+" ");
			}
		}
		System.out.println("\n");
	}
}
class Factorial extends Thread{
	@Override
	public void run() {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number whose factorial is to be found: ");
		int n=s.nextInt();
		int f=1;
		int i=1;
		while(i<=n) {
			f = f*i;
			i++;
		}
		System.out.println("Factorial of "+n+" is: " + f);
	}
}
class Fibonacci extends Thread{
	@Override
	public void run() {
		System.out.println("Fibonacci Upto 30: ");
		int a=0;
		int b=1;
		while(a<=30) {
			System.out.print(a + " ");
			int c = a+b;
			a=b;
			b=c;
		}
		System.out.println("\n");
	}
}
public class MultiThreadExEvenFactoralFibonacci {

	public static void main(String[] args) {
		EvenNumbers even = new EvenNumbers();
		even.start();

		Factorial fact = new Factorial();
		fact.start();

		Fibonacci fib = new Fibonacci();
		fib.start();

	}

}
