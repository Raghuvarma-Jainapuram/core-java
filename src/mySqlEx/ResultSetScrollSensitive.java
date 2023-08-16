package mySqlEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetScrollSensitive {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb","root","Raghu1819@");
		Statement stmt=con.createStatement ( ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		
		ResultSet rs = stmt.executeQuery("select * from employeedata");
		while(rs.next()) {
			
			rs.moveToInsertRow();
	        rs.updateInt(1, 101);
	        rs.updateString(2, "Rajesh");
	        rs.updateString(3, "Hyderabad");
	        rs.insertRow();
	        System.out.println("1 ROW INSERTED...");
			
			// update row and delete row
			if(rs.getInt(1)==101) {
				rs.updateFloat(4, 18000);
				rs.updateInt(5, 22);
				rs.updateRow();
				System.out.println("Record updated!");
				
//				rs.deleteRow();
//				System.out.println("Record deleted");
			}
		}
	}

}
