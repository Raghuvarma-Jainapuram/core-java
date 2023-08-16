package java8;

interface Addition2{
	int add(int a, int b);
}

interface Multiplication2{
	int mul(int a, int b);
}

interface Subtraction2{
	int sub(int a, int b);
}

interface Division2{
	int div(int a, int b);
}

interface Modulo2{
	int mod(int a, int b);
}

public class LambdaExpressionArithmeticOperations {

	public static void main(String[] args) {
		Addition2 addition = (int a, int b)->a+b;
		System.out.println("Addition: 8 + 9 = "+addition.add(8,  9));

		Multiplication2 multiplication = (int a, int b)->a*b;
		System.out.println("Multiplication: 4 * 6 = "+multiplication.mul(4, 6));

		Subtraction2 subtraction = (int a, int b)->b-a;
		System.out.println("Subtraction: 47 - 4 = "+subtraction.sub(4, 47));

		Division2 division = (int a, int b)->a/b;
		System.out.println("Division: 123 / 3 = "+division.div(123, 3));

		Modulo2 modulo = (int a, int b)->b%a;
		System.out.println("Modulo: 230 % 7 = "+modulo.mod(7, 230));


	}

}
