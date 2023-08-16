package mySqlEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BatchEx {

	public static void insert(List<PersonEntity> personEntities) throws SQLException, ClassNotFoundException{
		Class.forName("com.mysql.cj.jdbc.Driver"); // registering driver
		String url="jdbc:mysql://localhost:3306/employeedb";
		Connection con=DriverManager.getConnection(url,"root","Raghu1819@");// establish connection
		String q1="INSERT INTO learner(Lid,Lname,Lage,Gender,City,Degree) VALUES(?,?,?,?,?,?)";
		
		PreparedStatement ps=con.prepareStatement(q1);
		
		for(PersonEntity personEntity:personEntities) {
			ps.setInt(1, personEntity.getId());
			ps.setString(2, personEntity.getName());
			ps.setInt(3, personEntity.age);
			ps.setString(4, personEntity.gender);
			ps.setString(5, personEntity.city);
			ps.setString(6, personEntity.degree);
			
			ps.addBatch();
		}
		ps.executeBatch();
		System.out.println("Data inserted.");
	}

	public static void main(String[] args) throws SQLException, ClassNotFoundException{
		List<PersonEntity> l = new ArrayList<>();
		l.add(new PersonEntity(3, "Mamatha",22,"Female","Yadadri","MCA"));
		l.add(new PersonEntity(5, "Ranjith",22,"Male","Karimnagar","MBA"));
		l.add(new PersonEntity(8, "Harika",22,"Female","Jagtial","B.Tech"));
		l.add(new PersonEntity(7, "Rajesh",22,"Male","Hyderabad","Bsc"));
		insert(l);

	}

}
