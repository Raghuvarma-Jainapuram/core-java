package java8;

import java.util.Scanner;

@FunctionalInterface
interface Validate{
	boolean login(String userName, String password);
}

public class FunctionalInterfaceValidateUser {

	static boolean login(String userName, String password) {
		Validate v = (user, pass)->
		{
			return((user.equals("Raghuvarma") && pass.equals("Jainapuram")))?true:false;
		};
		/*
		  Validate v=(String uname, String pass)->
		  {
			if((uname=="ABC") && (pass=="DEF")) {
				return true;
			}
			else {
				return false;
			}
		};*/
		return v.login(userName, password);
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your Username and password");
		String username = s.next();
		String password = s.next();
		
		System.out.println(login(username, password));
		
		s.close();
	}

}
