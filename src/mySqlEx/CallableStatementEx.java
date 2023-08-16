package mySqlEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.cj.jdbc.CallableStatement;

public class CallableStatementEx {
	public static void main(String[] args) throws SQLException,ClassNotFoundException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/employeedb";
		Connection con=DriverManager.getConnection(url, "root", "Raghu1819@");
		System.out.println(con);
		System.out.println("Database dbemployeedb connection successfully establish");
		
		//CallableStatement statement=con.prepareCall("{call employeedata_procedure(30000)}");
		CallableStatement statement=(CallableStatement) con.prepareCall("{call employeedata_procedure(30000)}");
		
		statement.execute();
		statement.close();
		System.out.println("Stored procedure called successfully");
	}
}
