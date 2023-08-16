package oops;

public class ConstructorOverloadingHW {
	ConstructorOverloadingHW() {
		System.out.println("default");
		System.out.println("Introduction:");
	}
	ConstructorOverloadingHW(String name) {
		System.out.println("Name: " + name);
	}
	ConstructorOverloadingHW(String scname, int rollNo) {
		System.out.println("School name: " + scname + ", " + "Roll no:" + rollNo);
	}
	ConstructorOverloadingHW(String scname, int rollNo, String subject, int marks) {
		System.out.println("School name: " + scname + ", Roll no: " + rollNo +", Subject: " +subject + ", Marks: " + marks );
	}
	public static void main(String[] args) {
		ConstructorOverloading c1 = new ConstructorOverloading();
		ConstructorOverloading c2 = new ConstructorOverloading("Hanu", 10002);
		ConstructorOverloadingHW c3 = new ConstructorOverloadingHW("Greenfinger", 10002, "Java",92);
	}

}

