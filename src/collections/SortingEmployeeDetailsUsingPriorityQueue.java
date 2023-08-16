package collections;

import java.util.PriorityQueue;

class Employee implements Comparable<Employee>{
	private String name;
	private double salary;
	
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
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
	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		//return Objects.hash(name, salary);
		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		return false;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return 0;
	}
}

public class SortingEmployeeDetailsUsingPriorityQueue {

	public static void main(String[] args) {
		PriorityQueue<Employee> employeePriorityQueue = new PriorityQueue<>();
		
		employeePriorityQueue.add(new Employee("Honey", 100000.00));
		employeePriorityQueue.add(new Employee("Shiva", 45000.00));
		employeePriorityQueue.add(new Employee("Anil", 15000.00));
		employeePriorityQueue.add(new Employee("Jiya", 7000.00));
		
		while(!employeePriorityQueue.isEmpty()) {
			System.out.println(employeePriorityQueue.remove());
		}

	}

}
