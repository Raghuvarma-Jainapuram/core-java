package basic;
import java.util.Scanner;
public class EvenOrOdd {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int number = s.nextInt();
		if(number%2==0) {
			System.out.println("Even number.");
		}
		else {
			System.out.println("Odd number.");
		}
		s.close();
	}
}
