package oops;

public class MethodOverloading {
	static void methodOverloading() {
		int a=5,b=7;
		System.out.println("A + B : "+(a+b)+" (Default)");
	}
	static void methodOverloading(int a) {
		System.out.println("Value of A is " +a);
	}
	static void methodOverloading(String name, int age) {
		System.out.println("Name: "+name+", Age: "+age);
	}
	static void methodOverloading(String name, String clgName, String city) {
		System.out.println("Name: "+name+", College: "+clgName+", Location: "+city);
	}
	static void methodOverloading(String name, double height, float weight) {
		System.out.println("Name: "+name+", Height: "+height+"ft, Weigth:"+weight+"kg");
	}
	public static void main(String[] args) {
		//		MethodOverloading o=new MethodOverloading();
		methodOverloading();
		methodOverloading(48);
		methodOverloading("Lokesh",20);
		methodOverloading("Varun","Osmania University","Hyderabad");
		methodOverloading("Varun",5.8,53f);

	}
}
