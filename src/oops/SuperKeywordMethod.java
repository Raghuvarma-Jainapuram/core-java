package oops;


class One{
	void display() {
		System.out.println("Parent class");
	}
}
class Two extends One{
	void display() {
		super.display(); // call the superclass method
		System.out.println("Child class");
	}
}
public class SuperKeywordMethod {

	public static void main(String[] args) {
		One t = new Two();
		t.display();

	}

}
