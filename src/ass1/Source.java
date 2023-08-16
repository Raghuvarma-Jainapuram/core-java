package ass1;
import java.util.Scanner;

/*
 * class definitions:
 * class MyException: Define exception
 * class source:
 * method definitions:
 * checkName(String firstName, LastName) throw a user defined
 exception if firstName and LastName is blank else return name
 * return type: String
 * visibility: public
 */
class MyException1{
	
	String fullName = "";
	
	public String checkName(String fname, String lname) throws Exception {
		if(fname.isEmpty() && lname.isEmpty()) {
			throw new Exception("Name is empty.");
		}
		else {
			fullName = fname + lname;			
		}
		return fullName;
	}
}

public class Source {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First name");
		String firstName = sc.nextLine();
		System.out.println("Enter Last name");
		String lastName = sc.nextLine();
		
		MyException1 me=new MyException1();
		try {
			System.out.println(me.checkName(firstName, lastName));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		sc.close();
	}

}
