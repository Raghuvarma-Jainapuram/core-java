package java8;


interface Int2{
	void abstractMethod2();
	
	default void display() {
		System.out.println("Interface 2: Dafalut Method");
	}
	
	static void display1() {
		System.out.println("Interface 2: Static Method...");
	}
}

interface Int1{
	void abstractMethod1();
	
	default void display() {
		System.out.println("Interface 1: Default Method...");
	}
	
	static void display1() {
		System.out.println("Interface 1: Static Method...");
	}
}

public class NormalInterface implements Int1, Int2 {

	public static void main(String[] args) {
		
		NormalInterface ni = new NormalInterface(); // Reference of NormalInterface class to access Interface. We cannot create an object for Interface.
		ni.abstractMethod1();
		ni.display();
		Int1.display1();
		
		ni.abstractMethod2();
		ni.display();
		Int2.display1();

	}

	@Override
	public void abstractMethod1() {
		System.out.println("Interface 1: Abstract Method...");
		
	}

	@Override
	public void abstractMethod2() {
		System.out.println("Interface 2: Abstract Method...");
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		Int2.super.display();
	}

}
