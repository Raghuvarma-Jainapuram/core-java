package practiceEx;

import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] a) {
		System.out.println("Prime numbers from 1 to 100:");
		for(int prime=2;prime<=100;prime++) {
			int factCount = 0;
			for(int i=1;i<=prime;i++) {
				if(prime%i==0) {
					factCount +=1;
				}
			}
			if(factCount==2)System.out.print(prime +" ");
		}

		Scanner s = new Scanner(System.in);
		System.out.println("\nEnter a number to check whether it is a prime or not");
		int n=s.nextInt();
		int factCount = 0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				factCount +=1;
				if(factCount>2) {
					System.out.println("The number is not prime");
					break;
				}
			}
		}
		if(factCount==2)System.out.println("The number is prime");
		s.close();
	}
}
