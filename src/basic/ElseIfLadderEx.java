package basic;
import java.util.Scanner;
public class ElseIfLadderEx {
	public static void main(String[] args) {
		Scanner marks = new Scanner(System.in);
		System.out.println("Enter java marks :");
		int java = marks.nextInt();
		System.out.println("Enter python marks :");
		int python = marks.nextInt();
		System.out.println("Enter html marks :");
		int html = marks.nextInt();
		int avg_marks = (java+python+html)/3 ;
		System.out.println(avg_marks);
		if(avg_marks <=100 && avg_marks >= 90) {
			System.out.println("A+");
		}
		else if(avg_marks < 90 && avg_marks >= 80) {
			System.out.println("A");
		}
		else if(avg_marks < 80 && avg_marks >= 70) {
			System.out.println("B+");
		}
		else if(avg_marks < 70 && avg_marks >= 60) {
			System.out.println("B");
		}
		else if(avg_marks < 60 && avg_marks >= 50) {
			System.out.println("c");
		}
		else if(avg_marks < 50){
			System.out.println("Fail");
		}
		else {
			System.out.println("Invalid marks!");
		}
		marks.close();
	}
}
