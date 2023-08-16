package exceptions;

public class ClassNotFoundEx {
// Compile time --> also checked exception
	// ex- ClassNotFoundException, IOException, SQLException
	public static void main(String[] args) {
		try {
			//Class.forName("Class doesn't exist");
			//Class.forName("basic.EnumEx");
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Class found");
		}catch(Exception e) {
			//e.printStackTrace();
			System.out.println(e);
			System.out.println("Class not found");
		}
		
		

	}

}
