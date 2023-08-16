package inheritance;
import java.util.Scanner;

// Super class
class Student{
	String name;
	Student(String nm){
		name = nm;
		System.out.println("Name: "+name);
	}
}
// Sub class
class Developer extends Student{
	String role;
	String name;
	Developer(String name, String role){
		super(name);
		this.role = role;
		System.out.println("Role: "+role);
	}
}
public class SingleInheritanceUsingContructor {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Name :");
		String name=s.nextLine();
		System.out.println("Enter Role :");
		String role=s.nextLine();
		Developer d = new Developer(name, role);
		s.close();
	}

}