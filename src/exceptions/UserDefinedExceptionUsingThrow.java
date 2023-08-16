package exceptions;

import java.util.Scanner;
public class UserDefinedExceptionUsingThrow {
	static String age(int age) throws Exception {
		if(age>=18) {
			return "Access granted";
		}
		else {

//			throw new ArithmeticException("Access denied");
			throw new Exception("Access denied");
		}
	}
	public static void main(String[] args) throws Exception {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age=s.nextInt();
//		UserDefinedExceptionUsingThrow u = new UserDefinedExceptionUsingThrow();
//		u.age(age);
		System.out.println(age(age));
		s.close();
	}

}

