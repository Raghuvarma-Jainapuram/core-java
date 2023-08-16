package mySqlEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.CallableStatement;

public class CallableEx {
	public static void main(String[] args) throws SQLException, ClassNotFoundException{
		String jdbUrl="jdbc:mysql://localhost:3306/employeedb?useSSL=false";
		String username="root";
		String password="Raghu1819@";
		String sql="call employeedata_procedure(30000)";
		
		try(Connection conn = DriverManager.getConnection(jdbUrl,username,password);
				CallableStatement stmt = (CallableStatement) conn.prepareCall(sql);
				ResultSet rs = stmt.executeQuery();){
			while(rs.next()) {
				System.out.println("ID = " +rs.getInt(1)+", NAME = "+rs.getString(2)+", SALARY = "+rs.getInt(3)+", CITY = "+rs.getString(4));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
