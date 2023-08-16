package basic;

public class PolindromNumberOrNot {
	public static void main(String[] args) {
		int num = 121;
		int temp = num;
		int reverseNum = 0; 
		while(temp!=0){
			int rem = temp%10;
			reverseNum = reverseNum*10 + rem;
			temp = temp/10;
		}
		if(num == reverseNum) {
			System.out.println("Polindrom Number");
		}
		else {
			System.out.println("Not a polindrom Number");
		}
	}
}
