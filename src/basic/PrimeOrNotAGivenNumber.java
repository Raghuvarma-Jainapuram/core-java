package basic;
import java.util.*;
public class PrimeOrNotAGivenNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number to check whether it is a prime or not: ");
		int number = s.nextInt();
		
		if(number < 1) {
			System.out.println("Enter valid number");
		}
		else if(number == 1) {
			System.out.println("Not a prime number");
		}
		else if(number == 2) {
			System.out.println("Prime number");
		}
		else {
			int count = 0;
			for(int i=2; i<number; i++) {
				if(number % i == 0) {
					count += 1;
				}
				if(count >= 1) {
					System.out.println("Not a Prime number");
					break;
				}
			}if(count < 1) {
				System.out.println("Prime number");
			}
		}
	}

}
