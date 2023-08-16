package basic;

class S_Details{
	// Instance variables, defined in class
	String name;
	String degree;
}

class HWOnMethosAndVariables {
	void enrollment() {
		// Local variable
		String enrollmentNo = "EBEON0623793065";
		System.out.println("Enrollment Number : " + enrollmentNo);
	}
	float marks() {
		return 7.80f;
	}
	String city() {
		return "Hyderabad";
	}
	public static void main(String[] args) {

		HWOnMethosAndVariables E_M = new HWOnMethosAndVariables();
		
		// Instance variables, accessing 
		S_Details sd = new S_Details();
		sd.name = "Raghuvarma";
		sd.degree = "Master of Computer Applications";
		
		//Displaying details for student 
		E_M.enrollment();
		System.out.println("Name : " + sd.name);
		System.out.println("Qualification : " + sd.degree);
		System.out.println("Grade : " + E_M.marks() + " CGPA");
		System.out.println("Location : " + E_M.city());
	}

}
