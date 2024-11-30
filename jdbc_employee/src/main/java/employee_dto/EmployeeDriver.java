package employee_dto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EmployeeDriver {
	
	public  Connection getConnection() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/naresh","root", "root");
		return connection;
		
	}
	public void insertEmployee(Employee e) throws SQLException, ClassNotFoundException
	{
		
	        Connection connection  = getConnection();	
		     java.sql.PreparedStatement ps = connection.prepareStatement("insert into emplyee values(?,?,?,?)") ;
		     ps.setInt(1, e.getEmpId());
		     ps.setString(2,e.getName());
		     ps.setString(3,e.getEmpMail());
		     ps.setInt(4,e.getEmpPwd());
		     ps.execute();
		     System.out.println("inserted");
		     ps.close();
		     connection.close();
	}

}
