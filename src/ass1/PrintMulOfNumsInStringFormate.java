package ass1;

import java.util.Scanner;

public class PrintMulOfNumsInStringFormate {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int multiplication = a*b;
		String str = Integer.toString(multiplication);
		System.out.println(str);
		s.close();
	}

}
