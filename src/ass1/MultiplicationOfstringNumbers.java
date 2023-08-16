package ass1;

import java.util.Scanner;

public class MultiplicationOfstringNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String a=input.next();
		String b=input.next();
		try {
			int mul = Integer.parseInt(a) * Integer.parseInt(b);
			String result = Integer.toString(mul);
			System.out.println(result);
		}catch(NumberFormatException e){
			System.out.println(e);
		}
		
		input.close();
	}
}
/*
 * int a = input.nextInt();
		int sum =0;
		for(int i=1;i<=8;i++) {
			sum=sum+a;
		}
		System.out.println(sum);
		*/
