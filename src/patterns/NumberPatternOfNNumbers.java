package patterns;
import java.util.Scanner;


class printPattern {
	void PatternPrint(int num) {
		for(int i=1;i<=num;i++) {
			for(int j=num;j>=1;j--) {
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
}
public class NumberPatternOfNNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter n number of inputs: ");
		int n = input.nextInt();
		int[] arr= new int[n];
		System.out.println("Enter n inputs: ");
		for(int i=0;i<n;i++) {
			arr[i]=input.nextInt();
		}
		for(int i=0;i<n;i++) {
		printPattern p = new printPattern();
		p.PatternPrint(arr[i]);
		}
		input.close();
	}
}
