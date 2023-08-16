package basic;

/*
1.Unary
2.Arithmetic
3.Shift
4.Relational
5.Bitwise
6.Logical
7.Ternary
8.Assignment
 */

public class OperatorsEx {
	 int a=19;
	 int b=26;
	 int c=17;
	 int d=28;
	public static void main(String[] args) {
		OperatorsEx OE = new OperatorsEx();
		
		OE.UniaryOperators();
		OE.ArithmeticOperators();
		OE.ShiftOperators();
		OE.RelationalOperators();
		OE.BitwiseOperators();
		OE.LogicalOperators();
		OE.TernaryOperators();
		OE.AssignmentOperators();
	}

	void UniaryOperators() {
		System.out.println("UniaryOperators:\n---------------");
		int x = 100;
		System.out.println("x : "+x);
		System.out.println("~X = " + ~x);
		System.out.println("x++ = "+ x++);     // Post increment
		System.out.println("++x = "+ ++x);     // Pre increment
		System.out.println("x-- = "+ x--);     // Post decrement
		System.out.println("--x = "+ --x);     // Pre decrement
		x=20;
		System.out.println("x = "+x);
		System.out.println("++x*10/x++ + ++x = "+(++x*10/x++ + ++x));
		
	}
	void ArithmeticOperators() {
		System.out.println("\nArithmeticOperators:\n------------------- ");
		System.out.println("a , b : " +(a) +" , "+ (b));
		System.out.println("a+b = "+ (a+b));     // Addition
		System.out.println("a-b = "+ (a-b));     // Subtraction
		System.out.println("a*b = "+ (a*b));     // Multiplication
		System.out.println("a/b = "+ (a/b));     // Division
		System.out.println("a%b = "+ (a%b));     // Modulo
	}
	void ShiftOperators() {
		System.out.println("\nShiftOperators:\n-------------- ");
		int x=10;
		System.out.println("x : " +x);
		System.out.println("x>>1 = "+(x>>1));       // Signed right shift 
		System.out.println("x>>>1 = "+(x>>>1));     // Unsigned right shift
		System.out.println("x<<1 = "+(x<<1));       // Signed left shift
		//System.out.println("x<<<1 = "+(x<<<1));   // Unsigned left shift
	}
	void RelationalOperators() {
		System.out.println("\nRelationalOperators:\n------------------- ");
		System.out.println("a , b : " +(a) +" , "+ (b));
		System.out.println("a==b : " +(a==b));     // Equals to");
		System.out.println("a!=b : " +(a!=b));     // Not Equals to");
		System.out.println("a<b : " +(a<b));       // Less than");
		System.out.println("a>b : " +(a>b));       // Greater than");
		System.out.println("a>=b : " +(a>=b));     // Greater than or equal to");
		System.out.println("a<=b : " +(a<=b));     // Less than or equal to");
	}
	void BitwiseOperators() {
		System.out.println("\nBitwiseOperators:\n---------------- ");
//		int a=0001;
//		int b=0100;
		System.out.println("a, b : " +a+", "+b);
		System.out.println("a|b = " + (a|b));       // Bitwise OR
		System.out.println("a&b = " + (a&b));       // Bitwise AND
		System.out.println("a^b = " + (a^b));       // Bitwise XOR
		System.out.println("~a = " + (~a));         // Bitwise Complement

	}
	void LogicalOperators() {
		System.out.println("\nLogicalOperators:\n---------------- ");
		System.out.println("a, b : " +a+", "+b);
		System.out.println("a>10&&b<20 : " + (a>10&&b<20));     // Logical AND
		System.out.println("a<10||b>20 : " + (a<10||b>20));     // Logical OR
		System.out.println("a!=b : " + (a!=b));                 // Logical NOT

	}
	void TernaryOperators() {
		System.out.println("\nTernaryOperators:\n---------------- ");
		int marks = 85;
		System.out.println("a, b, c, d : " +a+", "+b+", "+c+", "+d);
		String r = d%2==0?"Even number" : "Odd number";        // condition ? value1 : value2
		System.out.println("d = "+ d +" " +r);
		int max = (a>b)?(a>c?a:c):(b>c?b:c);                   // condition ? value1 : value2
		System.out.println("Highest of three numbers : " + max );
		int min = (a<b)?(a<c?a:c):(b<c?b:c);                   // condition ? value1 : value2
		System.out.println("Smallest of three numbers : " + min);
		
		String result = marks>35?"Pass":"Fail";                // condition ? value1 : value2
		System.out.println("Marks, Status : " + marks +", "+ result);

	}
	void AssignmentOperators() {
		System.out.println("\nAssignmentOperators:\n------------------- ");
		System.out.println("a, b, c, d : " +a+", "+b+", "+c+", "+d);
		System.out.println("a+=1 : "+(a+=1));       // adding before assign
		System.out.println("b-=3 : "+(b-=3));       // Subtract before assign
		System.out.println("a=-3 : "+(a=-3));       // Subtract after assign
		System.out.println("b=+6 : "+(b=+6));       // Adding after assign
		System.out.println("c*=3 : "+(c*=3));       // Multiply before assign
		System.out.println("d/=2 : "+(d/=2));       // Divide before assign
		System.out.println("c%=d : "+(c%=d));       // Modulus before assign
		
	}

}
