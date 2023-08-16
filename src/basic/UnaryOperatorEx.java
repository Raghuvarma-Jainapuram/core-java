package basic;

public class UnaryOperatorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=20;
		int y=++x*10/x++ + ++x;
		System.out.println("x : "+x);
		System.out.println("++x*10/x++ + ++x : "+y);
		x = 100;
		System.out.println("Tilt x(100) value : " + ~x);
		
		System.out.println("Unary operator Incrementing using for loop");
		int a;
		int b;
		for(a=1; a<=5; a++) {
			System.out.print(a + " ");
		}
		System.out.println();
		System.out.println("Unary operator Decrementing using for loop");
		for(b=5; b>=1; b--) {
			System.out.print(b + " ");
		}
		System.out.println();
	}

}
