package mySqlEx;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
public class MenuDriven {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver"); // registering driver
		Connection conn=null;
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb","root","Raghu1819@");// establish connection
		System.out.println("Database is connected!");

		int sid,marks;
		String sname,subject;
		Scanner input=new Scanner(System.in);
		while(true){
			System.out.println("Click 1 - Add Details");
			System.out.println("Click 2 - Display of Student details");
			System.out.println("Click 3 - Update of Student details");
			System.out.println("Click 4 - Delete of Student details");
			System.out.println("Click 5 - Exit");
			System.out.println("Enter your choice");


			int choice = input.nextInt();
			switch(choice) {
			case 1:
				System.out.print("Enter student id: ");
				sid=input.nextInt();
				System.out.print("Enter student name: ");
				sname=input.next();
				System.out.print("Enter subject: ");
				subject=input.next();
				System.out.print("Enter marks: ");
				marks=input.nextInt();

				String insert = "insert into student_menudriven(sid,sname,subject,marks) values(?,?,?,?)";
				PreparedStatement ps=conn.prepareStatement(insert);
				ps.setInt(1, sid);
				ps.setString(2, sname);
				ps.setString(3, subject);
				ps.setInt(4, marks);

				ps.executeUpdate();
				ps.close();
				System.out.println("Record Inserted!");
				break;
			case 2:

				break;
			case 3:

				break;
			case 4:

				break;
			case 5:

				break;
			default:
				System.out.println("Invalid choice!");
			}
		}
	}

}

/*
case 1:
System.out.println("enter values to insert");
System.out.println("enter student id");
int id = sc.nextInt();
System.out.println("enter course cid");
int cid = sc.nextInt();
System.out.println("enter course name");
String cname = sc.next();
PreparedStatement p = connection.prepareStatement("insert into course values(?,?,?)");
p.setInt(1, id);
p.setInt(2, cid);
p.setString(3, cname);
p.executeUpdate();
System.out.println("Data successfully inserted");
break;
 */
