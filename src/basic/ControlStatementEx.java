package basic;
import java.util.Scanner;
public class ControlStatementEx {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a and b values: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a>b) {
			System.out.println("a is max");
		}
		else if(a==b){
			System.out.println("Both are equal");
		}
		else {
			System.out.println("b is max");
		}
		sc.close();
	}
}
