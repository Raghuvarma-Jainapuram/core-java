package basic;

public class SumOfDigits {
	public static void main(String[] args) {
		int num = 579;
		int sum=0;
//		int rem=0;`
		while(num>0) {
			sum += num%10;
//			sum += rem;
			num = num/10;
		}
		System.out.println("Sum of 579 : " + sum);
	}
}
