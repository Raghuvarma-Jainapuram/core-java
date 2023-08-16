package patterns;
import java.util.Scanner;

public class NumberPatternOf3Numbers {
	static void PatternPrint(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=1;j--) {
				if(i>=j) {
					System.out.print(i + " ");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 3 inputs: ");
		int n1=input.nextInt();
		int n2=input.nextInt();
		int n3=input.nextInt();
		
		PatternPrint(n1);
		PatternPrint(n2);
		PatternPrint(n3);
		input.close();
	}
}
