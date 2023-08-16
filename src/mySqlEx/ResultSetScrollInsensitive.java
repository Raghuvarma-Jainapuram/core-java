package mySqlEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetScrollInsensitive {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb","root","Raghu1819@");
		Statement stmt=con.createStatement ( ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY );
		
		ResultSet rs = stmt.executeQuery("select * from employeedata");
		while(rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
		}
		rs.first();
		System.out.print("First row: ");
		System.out.println(rs.getInt(1)+", "+rs.getString(2));
		
		rs.last();
		System.out.print("Last row: ");
		System.out.println(rs.getInt(1)+", "+rs.getString(2));
		
		rs.absolute(3);
		System.out.print("Third row: ");
		System.out.println(rs.getInt(1)+", "+rs.getString(2));
		
		rs.previous();
		System.out.print("Previous row: ");
		System.out.println(rs.getInt(1)+", "+rs.getString(2));
		
		rs.relative(-1);
		System.out.print("Relative row: ");
		System.out.println(rs.getInt(1)+", "+rs.getString(2));
	}

}
