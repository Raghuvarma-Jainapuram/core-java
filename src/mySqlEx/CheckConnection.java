package mySqlEx;

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//import com.mysql.cj.xdevapi.PreparableStatement;

public class CheckConnection {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/employeedb";
//		String url="jdbc:mysql://localhost:3306/ass";
		Connection con=DriverManager.getConnection(url,"root","Raghu1819@");
//		System.out.println("Database emp connection successfully establish");
//		System.out.println(con);
		
//		Statement stmt;
//		stmt=con.createStatement();
		
		// Insert row
//		String query1="INSERT INTO employeedata values(5,'Mamatha','Hyderabad',32000.00,22)";
//		stmt.executeUpdate(query1); // stmt.execute(query1);
//		System.out.println("Query1 Inserted.");
		
		// update row
//		String query2="UPDATE employeedata set salary=32000.00, rollno=42 where eid=2";
//		stmt.executeUpdate(query2); // stmt.execute(query1);
//		System.out.println("Query2 Updated.");

		// update row
//		String query3="UPDATE employeedata set rollno=30 where eid=5";
//		stmt.executeUpdate(query3);
//		System.out.println("Query3 Updated.");

		// delete row
//		String query4="DELETE FROM employeedata where eid=2";
//		stmt.executeUpdate(query4);
//		System.out.println("Query3 Daleted.");
		
		// select table records
//		ResultSet rs = null;
//		rs = stmt.executeQuery("select * from college");
//
//		System.out.println("No of Records:");
//		while (rs.next()) {
//			// Display values
//			System.out.print("Rollno: " + rs.getInt("rollno"));
//			System.out.print(", Name: " + rs.getString("name"));
//			System.out.print(", class: " + rs.getString("class"));
//			System.out.println();
//
//		}
		
		// insert row
//		PreparedStatement ps=con.prepareStatement("insert into employeedata values(?,?,?,?,? )");
//		ps.setInt(1, 2);
//		ps.setString(2, "Mamatha");
//		ps.setString(3, "Hyderabad");
//		ps.setInt(4, 32000);
//		ps.setInt(5, 30);
//		int i=ps.executeUpdate();
//		System.out.println("Recprd inserted: "+i);
		
		// insert row
//		PreparedStatement ps1=con.prepareStatement("insert into employeedata values(?,?,?,?,? )");
//		ps1.setInt(1, 4);
//		ps1.setString(2, "Ramya.k");
//		ps1.setString(3, "Hyderabad");
//		ps1.setInt(4, 29000);
//		ps1.setInt(5, 43);
//		int j=ps1.executeUpdate();
//		System.out.println("Recprd inserted: "+j);
//		
		// insert row
//		PreparedStatement ps2=con.prepareStatement("insert into employeedata values(?,?,?,?,? )");
//		ps2.setInt(1, 6);
//		ps2.setString(2, "Harisha");
//		ps2.setString(3, "Hyderabad");
//		ps2.setInt(4, 32000);
//		ps2.setInt(5, 25);
//		int k=ps2.executeUpdate();
//		System.out.println("Recprd inserted: "+k);
		
		// update row
//		PreparedStatement ps3=con.prepareStatement("update employeedata set ename=?,rollno=? where eid=?");
//		ps3.setString(1, "Ramya");
//		ps3.setInt(2, 42);
//		ps3.setInt(3, 4);
//		ps3.executeUpdate();
//		System.out.println("Row updated");
		
		// delete row
		String q="delete from employeedata where eid=?";
		PreparedStatement ps4=con.prepareStatement(q);
		ps4.setInt(1, 4);
		ps4.executeUpdate();
		System.out.println("Row deleted");
		
		// getting error
//		PreparedStatement ps=con.prepareStatement("create table emp1(id int primary key, name varchar(25),email varchar(40))");
//		System.out.println("Table created");
	}

}
