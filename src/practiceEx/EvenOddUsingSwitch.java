package practiceEx;

import java.util.Scanner;

public class EvenOddUsingSwitch {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		switch(n%2){
		case 0:
		    System.out.println("Even number");
		    break;
		case 1:
		    System.out.println("Odd number");
		}
		input.close();

	}

}
