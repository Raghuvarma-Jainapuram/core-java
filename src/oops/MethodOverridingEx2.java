package oops;

//Creating a parent class. 
class Books{
	//defining a method 
	void run()
	{
		System.out.println("Book not in stock");
	}
}
//Creating a child class
public class MethodOverridingEx2 extends Books{
	void run()
	{
		System.out.println("Book is available");
	}
	public static void main(String[] args) {
		MethodOverridingEx2 obj = new MethodOverridingEx2(); //creating object 
		obj.run(); //calling method
	}
}

