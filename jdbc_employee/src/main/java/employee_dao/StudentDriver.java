package employee_dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import employee_dto.Student;

public class StudentDriver {

	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/naresh", "root", "root");
		return con;
	}

	public void insertStudent(Student s) throws ClassNotFoundException, SQLException {
		Connection con = getConnection();
		PreparedStatement pr = con.prepareStatement("insert into students values(?,?,?,?)");
		pr.setInt(1, s.getStudentId());
		pr.setString(2, s.getStudentName());
		pr.setString(3, s.getStudentMail());
		pr.setInt(4, s.getStudentMailPwd());
		pr.executeUpdate();
		System.out.println("Inserted");
		pr.close();
		con.close();

	}

	public void deleteStudent(int id) throws ClassNotFoundException, SQLException {
		Connection con = getConnection();
		PreparedStatement pr = con.prepareStatement("delete from students where id = ?");
		pr.setInt(1, id);
		pr.executeUpdate();
		System.out.println("DELTED");
		pr.close();
		con.close();
	}

	public void update(int id, Student s) throws ClassNotFoundException, SQLException {
		Connection connection = getConnection();
		PreparedStatement pr = connection
				.prepareStatement("update students set studentname=?,studentmail=?,studentpwd=?,where id = ? ");
		pr.setInt(4, id);
		pr.setString(1, s.getStudentName());
		pr.setString(2, s.getStudentMail());
		pr.setInt(3, s.getStudentMailPwd());
		pr.executeUpdate();
		System.out.println("updated");
		pr.close();
		connection.close();
	}

	public void selectAll(int id) throws ClassNotFoundException, SQLException {
		Connection connection = getConnection();
		PreparedStatement pr = connection.prepareStatement("select * from students where id = ? ");
		pr.setInt(1, id);
		ResultSet rs = pr.executeQuery();
		while (rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getInt(4));
		}
		System.out.println("details of the student");
		pr.close();
		connection.close();
	}

}
