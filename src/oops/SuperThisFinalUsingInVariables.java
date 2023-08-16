package oops;

class Person_p {
	int age = 50;
	int rno=67;
	final String gender="Male";
}

public class SuperThisFinalUsingInVariables extends Person_p {  // inheritance
	int age = 30;   // Instance variable

	void insertStudentAge() {
		int age = 20;   // local variable
		//gender="Female"; // The final field Person_p.gender cannot be assigned
		System.out.println("Local variable:"+age);  // 20
		System.out.println("Instance Variable:"+this.age); // 30
		System.out.println("Parent class: "+super.age);  // 50
		System.out.println("Rollno :"+rno);  // 67
	}

	public static void main(String[] args) {

		SuperThisFinalUsingInVariables s = new SuperThisFinalUsingInVariables();
		System.out.println(s.age);  // 30
		s.insertStudentAge();

	}

}