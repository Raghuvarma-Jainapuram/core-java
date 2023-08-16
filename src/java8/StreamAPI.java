package java8;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

class Employee{
	int id;
	String name;
	double salary;
	String designation;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", designation=" + designation + "]";
	}
	public Employee(int id, String name, double salary, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
	}
}


public class StreamAPI {

	public static void main(String[] args) {
		ArrayList<Employee> emp = new ArrayList<>();
		emp.add(new Employee(01, "Harisha", 28000.0, "Java Developer"));
		emp.add(new Employee(02, "Mamatha", 28000.0, "Java Developer"));
		emp.add(new Employee(03, "Sanjay", 20000.0, "Python Developer"));
		emp.add(new Employee(04, "Harika", 35000.0, "Mulesoft Developer"));
		emp.add(new Employee(05, "Srivardhan", 32000.0, "Tester"));
		emp.add(new Employee(06, "Shirisha", 30000.0, "Software Engineer"));

		System.out.println("Total Employee's Data: "+emp);
		// Number of employees
		long count = emp.stream().count();
		System.out.println("Number of employee's: "+count);
		// Employee of Maximum salary
		Object Max_salary = emp.stream().collect(Collectors.maxBy(Comparator.comparingDouble(a->a.salary)));
		System.out.println("Employee of Maximum salary: "+Max_salary);
		// Employee of Minimum salary
		Object Min_salary = emp.stream().collect(Collectors.minBy(Comparator.comparingDouble(a->a.salary)));
		System.out.println("Employee of Minimum Salary: "+Min_salary);
		// Employee Average Salary
		double avg_salary = emp.stream().collect(Collectors.averagingDouble(a->a.salary));
		System.out.println("Average Salary: "+avg_salary);
		
		
		
	}

}
