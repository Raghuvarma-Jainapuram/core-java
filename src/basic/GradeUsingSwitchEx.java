package basic;

import java.util.Scanner;

public class GradeUsingSwitchEx {
	static String printGrade(int score) {
	// static void printGrade(int score) --> void method cannot return a value.
	// String printGrade(int score) --> a static method cannot refer to the non-static method.
		if(score >100 || score<0) {
			return "Invalid";
		}
		score = score/10;
		switch(score) {
		case 10:
			return "A+";
		case 9:
			return "A";
		case 8:
			return "B+";
		case 7:
			return "B";
		case 6:
			return "C+";
		case 5:
			return "C";
		default:
			return "Fail";
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your score");
		int score = input.nextInt();
//		String result = printGrade(score);
		System.out.println("Grade : " + printGrade(score));
		input.close();
	}
}
