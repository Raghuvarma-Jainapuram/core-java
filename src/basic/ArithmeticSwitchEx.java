package basic;
import java.util.Scanner;
public class ArithmeticSwitchEx {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Choose an operator : +, -, *, /, %");
		char operator=input.next().charAt(0);
		System.out.println("Enter first number : ");
		int num1 = input.nextInt();
		System.out.println("Enter second number : ");
		int num2 = input.nextInt();
		switch(operator) {
		case '+':
			System.out.println(num1+" + "+num2+" = "+(num1+num2));
			break;
		case '-':
			System.out.println(num1+" - "+num2+" = "+(num1-num2));
			break;
		case '*':
			System.out.println(num1+" * "+num2+" = "+(num1*num2));
			break;
		case '/':
			System.out.println(num1+" / "+num2+" = "+(num1/num2));
			break;
		case '%':
			System.out.println(num1+" % "+num2+" = "+(num1%num2));
			break;
		default:
			System.out.println("Something went wrong");
		}
		input.close();
//		String a = "Multiplication";
//		int b=12,c=4;
//		switch(a) {
//		case "Subtraction": System.out.println(b-c);
//		break;
//		case "Addition": System.out.println(b+c);
//		break;
//		case "Division": System.out.println(b/c);
//		break;
//		case "Modulus": System.out.println(b%c);
//		break;
//		case "Multiplication": System.out.println(b*c);
//		break;
//		default:
//			System.out.println("No Operation dne");
//		}

	}
}


