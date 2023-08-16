package exceptions;
import java.util.Scanner;
public class MarksExceptionEx {
	static void validateMarks(int marks) throws Exception {
		if(marks >=1 && marks<=100) {
			System.out.println("Your marks : " + marks);
		}
		else{
			throw new Exception("Invalid marks! please enter marks between 1 to 100");
		} 
	}
	public static void main(String[] args) throws Exception {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your marks");
		int marks = s.nextInt();
		validateMarks(marks);
		s.close();
	}

}
