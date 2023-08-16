package basic;

class SDetails{
	// Instance variables, defined in class
	String name;
	String degree;
	String city;
}

class InstanceAndLocalVariableEx {
	void enrollment() {
		// Local variable
		String enrollmentNo = "EBEON0623793065";
		System.out.println("Enrollment Number : " + enrollmentNo);
	}
	public static void main(String[] args) {
		InstanceAndLocalVariableEx sEnrollment = new InstanceAndLocalVariableEx();
		sEnrollment.enrollment();
		
		// Student Details	
		SDetails sd = new SDetails();
		sd.name = "Raghuvarma";
		sd.degree = "Master of Computer Applications";
		sd.city = "Hyderabad";
		
		//Displaying details for student 
		String name=sd.name; // local variable initialized with instance variable
		System.out.println("Name : " + name);
		System.out.println("Qualification : " + sd.degree);
		System.out.println("Location : " + sd.city);
	}

}
