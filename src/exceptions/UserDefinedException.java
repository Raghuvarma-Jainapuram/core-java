package exceptions;

import java.util.Scanner;
public class UserDefinedException {
	static void age(int age) {
		if(age<18) {
			throw new ArithmeticException("Access denied");
		}
		else {
			System.out.println("Access granted");
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age=s.nextInt();
		age(age);

	}

}
