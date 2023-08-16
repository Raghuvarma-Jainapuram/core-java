package ass1;

import java.util.Scanner;

public class CalculateDistanceTravelledByCar {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int u = 36;
		int a = 5;
		int t1 = s.nextInt();
		int t2 = s.nextInt();
		int result1 = ((u*1000)*(t1))/3600+(a*t1*t1)/2;
		System.out.println(result1);
		
		int result2 = ((u*1000)*(t2))/3600+(a*t2*t2)/2;
		System.out.println(result2);
	}

}
