package inheritance;

class Company{
	String company = "ABC Tech Solutions";
	void displayCompany() {
		System.out.println("Company : " + company);
	}
}
class Manager extends Company{
	String manager = "Rahul";
	void displayManager() {
		System.out.println("Manager : " + manager);
	}
}
class Employee extends Manager{
	String employee = "Rajesh";
	int empId = 12345;
	void displayEmployee() {
		System.out.println("Employee Name : " + employee);
		System.out.println("Employee Id : " + empId);
	}
}
public class MultilevelInheritanceEx1 {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.displayCompany();
		emp.displayManager();
		emp.displayEmployee();

	}

}
