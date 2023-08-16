package basic;

public class SwitchEx {
	public static void main(String[] args) {
		int a=3;
		switch(a) {
		case 1:
			System.out.println("I'm @ School");
			break;
		case 2:
			System.out.println("I'm @ Home");
			break;
		case 3:
			System.out.println("I'm @ Office");
			break;
		default:
			System.out.println("I'm not @ Home, Office, School");
		}
		System.out.println("------------");
		char c='a';
		switch(c) {
		case 'a':
			System.out.println("I'm @ School");
			break;
		case 'b':
			System.out.println("I'm @ Home");
			break;
		case 'c':
			System.out.println("I'm @ Office");
			break;
		default:
			System.out.println("I'm not @ Home, Office, School");
		}
	}
}
