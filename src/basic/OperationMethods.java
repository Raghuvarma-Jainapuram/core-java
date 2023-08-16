package basic;

class Operation{
	String displayName(String name) {
		return "Hello " + name;
	}
	void addition(int a, int b, int c) {
		System.out.println("Addition: " + (a+b+c));
	}
	int multiplication(int a, int b){
		return a*b;
	}
	void division(int a, int b){
		System.out.println("division: " +(a/b));
	}
	int modulo(int a, int b){
		return a%b;
	}
	int subtraction(int a, int b){
		return a-b;
	}
	static float result(float r){
		return r;
	}
}

public class OperationMethods {

	public static void main(String[] args) {
		
		Operation op = new Operation();
		System.out.println("Welcome to "+op.displayName("Edubridge!"));
		op.addition(5, 6, 7);
		System.out.println("Mutliplication: " + op.multiplication(3, 4));
		op.division(55, 6);
		System.out.println("modulo: " + op.modulo(32, 12));
		System.out.println("subtraction: " + op.subtraction(3, 4));
		System.out.println("Percentage: "+Operation.result(78.0F));
		//System.out.println(0101 | 0111);
		int a =2;
//		System.out.println("Right shift");
//		System.out.println(a>>1);
//		System.out.println(a>>2);
//		System.out.println(a>>3);
//		System.out.println("Left shift");
//		System.out.println(a<<1);
//		System.out.println(a<<2);
//		System.out.println(a<<3);

		System.out.println("Ternary Operators :");
		int b=5;
		int c=3;
		int d=23;
		String r = d%2==0?"number is even" : "number is odd";
		System.out.println(r);
		int max = (a>b)?(a>c?a:c):(b>c?b:c);
		System.out.println("Highest of three numbers : " + max );
		int min = (a<b)?(a<c?a:c):(b<c?b:c);
		System.out.println("Smallest of three numbers : " + min);
		
		int marks = 85;
		String result = marks>35?"Pass":"Fail";
		System.out.println(result);
		System.out.println("Assignment operator : " + (a+=b));
		
	}

}
