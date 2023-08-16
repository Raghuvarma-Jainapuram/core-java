package inheritance;
// parent class
class Student_S{
	String name="Raghuvarma";
	void display() {
		System.out.println("Hi...");
			}
}
// child class
class Developer_D extends Student_S{
	String role = "Java Developer";
	void displayRole() {
		System.out.println(name);
		System.out.println(role);
	}
}
public class SingleInheritanceUsingMethod {

	public static void main(String[] args) {
		Developer_D d= new Developer_D();
		d.display();       // calling parent method
		d.displayRole();   // calling child method

	}

}
