package oops;

public class ConstructorExStudent {
	int rno;
	String name;
	// default constructor
	public ConstructorExStudent() { 
		rno=3;
		name="A";
	}
	// parameterized constructor(2 parameter)
	public ConstructorExStudent(int rno, String nm) { 
		this.rno=rno;
		name=nm;
	}
	// parameterized constructor(1 parameter)
	public ConstructorExStudent(String nm) {
		rno=5;
		name=nm;
	}
	// copy constructor
	public ConstructorExStudent(ConstructorExStudent s) {
		name=s.name;
		rno=s.rno;
	}
	void display() {
		System.out.println("Student Roll No: "+rno);
		System.out.println("Student Name: "+name);
	}
	public static void main(String[] args) {
		ConstructorExStudent s=new ConstructorExStudent(); // reference
		s.rno=1;
		s.name="Raghu";
		s.display();
		ConstructorExStudent s1=new ConstructorExStudent();
		s1.rno=2;
		s1.name="Ramya";
		s1.display();
		ConstructorExStudent s2=new ConstructorExStudent();
		s2.display();
		ConstructorExStudent s4=new ConstructorExStudent(4,"S");
		s4.display();
		ConstructorExStudent s5=new ConstructorExStudent("H");
		s5.display();
		ConstructorExStudent s6=new ConstructorExStudent(s);
		s6.display();
	}
}
