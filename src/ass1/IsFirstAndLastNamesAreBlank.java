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
class MyException{
	
	String fullName = "";
	
	public String checkName(String firstname, String lastname) throws Exception {
		if(firstname.isEmpty() && lastname.isEmpty()) {
			throw new Exception("Invalid first and last name");
		}
//		else if(firstname.isEmpty()) {
//			throw new Exception("First name is missing");
//		}
//		else if(lastname.isEmpty()) {
//			throw new Exception("Last name is missing");
//		}
		else {
			fullName = firstname + lastname;			
		}
		return fullName;
	}
}

public class IsFirstAndLastNamesAreBlank { // Source

	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		String firstName = sc.next();
		String lastName = sc.next();
		
		MyException me=new MyException();
		
		try {
			System.out.println(me.checkName(firstName, lastName));
		}
		catch(Exception err){
			err.printStackTrace();
//			System.out.println("Invalid UserName and Password");
		}
		sc.close();
		
	}

}
