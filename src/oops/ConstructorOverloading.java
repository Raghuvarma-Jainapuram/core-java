package oops;

public class ConstructorOverloading {
	ConstructorOverloading() {
		System.out.println("default");
		System.out.println("Introduction:");
	}
	ConstructorOverloading(String name) {
		System.out.println("Name: " + name);
	}
	ConstructorOverloading(String scname, int rollNo) {
		System.out.println("School name: " + scname + ", " + "Roll no:" + rollNo);
	}
	public static void main(String[] args) {
//		ConstructorOverloading c1 = new ConstructorOverloading();
//		ConstructorOverloading c2 = new ConstructorOverloading("Hanu");
		ConstructorOverloading c3 = new ConstructorOverloading("Greenfinger", 12);
	}

}
