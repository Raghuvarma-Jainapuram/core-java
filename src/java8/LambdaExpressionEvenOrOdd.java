package java8;

interface IsEven1{
	boolean evod(int a);
}

interface EvenOdd1{
	String evod(int a);
}

public class LambdaExpressionEvenOrOdd {

	public static void main(String[] args) {
		IsEven1 isEven = (int a)->a%2==0;
		System.out.println("Is 238 even : " + isEven.evod(238));
		
		EvenOdd1 evenOdd = (int a)->{
			if(a%2==0) {
				return "Even";
			}
			else {
				return "Odd";
			}
		};
		System.out.println("237 is " + evenOdd.evod(237) +" Number.");
	}

}
