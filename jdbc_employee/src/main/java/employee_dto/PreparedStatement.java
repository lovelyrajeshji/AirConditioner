package employee_dto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
public class PreparedStatement {

	public static void getInsert() throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id of the student");
		int id = sc.nextInt();
		System.out.println("Enter the name of the student");
		String name = sc.next();
		System.out.println("enter phn");
		int n=sc.nextInt();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/naresh","root","root");
		java.sql.PreparedStatement st = connection.prepareStatement("insert into student values(?,?,?) ");
		st.setInt(1,id);
		st.setString(2,name);
		st.setInt(3,n);
		st.executeUpdate();
		System.out.println("inserted");
		st.close();
		connection.close();
		                   

	}
	public static void getDelete() throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id of the student");
		int id = sc.nextInt();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/naresh","root","root");
		java.sql.PreparedStatement st = connection.prepareStatement("Delete from student where id = (?) ");
		st.setInt(1, id);
		
		
	}

}
