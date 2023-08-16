package collections;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


class EmployeeEx{
	String eName;
	double eSalary;
	private LocalDate eDOJ;
//	LocalDate eDOJ;
	public EmployeeEx(String eName, double eSalary, LocalDate eDOJ) {
		super();
		this.eName = eName;
		this.eSalary = eSalary;
		this.seteDOJ(eDOJ);
	}
	@Override
	public String toString() {
		return "Employee [eName=" + eName + ", eSalary=" + eSalary + ", eDOJ=" + geteDOJ() + "]";
	}
	public LocalDate geteDOJ() {
		return eDOJ;
	}
	public void seteDOJ(LocalDate eDOJ) {
		this.eDOJ = eDOJ;
	}
	
	
}

//class SortByEmployeeName implements Comparator<EmployeeEx>{
//
//	@Override
//	public int compare(EmployeeEx o1, EmployeeEx o2) {
//		// TODO Auto-generated method stub
//		return o1.eName.compareTo(o2.eName);
//	}
//	
//}

class SortByEmployeeDOJ implements Comparator<EmployeeEx>{

	@Override
	public int compare(EmployeeEx o1, EmployeeEx o2) {
		// TODO Auto-generated method stub
		
		return o1.geteDOJ().compareTo(o2.geteDOJ());
	}
	
}

//class SortByEmployeeSalary implements Comparator<EmployeeEx>{
//
//	@Override
//	public int compare(EmployeeEx o1, EmployeeEx o2) {
//		// TODO Auto-generated method stub
//		return (int) (o1.eSalary - o2.eSalary);
//	}
//	
//}

public class SortingEmployeeDetailsUsingArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<EmployeeEx> e = new ArrayList<EmployeeEx>();
		e.add(new EmployeeEx("Mamatha", 28000.00, LocalDate.of(2021,12,20)));
		e.add(new EmployeeEx("Ajay", 25000.00, LocalDate.of(2020,06,15)));
		e.add(new EmployeeEx("Harisha", 28000.00, LocalDate.of(2021,12,20)));
		e.add(new EmployeeEx("Srivardhan", 27000.00, LocalDate.of(2020,03,12)));
		e.add(new EmployeeEx("Harika", 35000.00, LocalDate.of(2020,07,25)));
		
		
//		Collections.sort(e, new SortByEmployeeName());
//		System.out.println("Sort by Employee Name:");
		
		Collections.sort(e, new SortByEmployeeDOJ());
		System.out.println("Sort by Employee Date of joining:");
		
//		Collections.sort(e, new SortByEmployeeSalary());
//		System.out.println("Sort by Employee Salary:");
		
		for(int i=0; i<e.size(); i++) {
			System.out.println(e.get(i));
		}
	}

	

}
