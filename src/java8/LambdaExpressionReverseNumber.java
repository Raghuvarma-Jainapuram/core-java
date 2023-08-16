package java8;

interface NumberReversing{
	int reverse(int n);
}

public class LambdaExpressionReverseNumber {

	public static void main(String[] args) {
		NumberReversing rn = (int num)->
		{
			int reverseNum = 0; 
			while(num!=0){
				int rem = num%10;
				reverseNum = reverseNum*10 + rem;
				num = num/10;
			}
			return reverseNum;
		};
		System.out.println("Original Number: "+12345);
		System.out.println("Reversed Number: "+rn.reverse(12345));
	}

}
