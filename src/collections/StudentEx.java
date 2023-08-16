package collections;
import java.util.*;
// class 1
class Student{
	int rollNo;
	String name, address;
	public Student(int rollNo, String name, String address) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", address=" + address + "]";
	}
}

// class 2
class Sortbyroll implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
public class StudentEx {

	
	public static void main(String[] args) {
		ArrayList<Student> ar = new ArrayList<Student>();
		

	}

}
