package employee_dto;
import java.sql.SQLException;
import java.util.Scanner;
public class EmployeeDriver1 {

	public static void main(String[] args) throws  SQLException, ClassNotFoundException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id ");
		int id = sc.nextInt();
		System.out.println("Enter the name of the employee");
		String name = sc.next();
		System.out.println("Enter the email");
		String mail = sc.next();
		System.out.println("MAIL PWD");
		 int pwd = sc.nextInt();
		
		Employee e = new Employee();
		e.setEmpId(id);
		e.setName(name);
		e.setEmpMail(mail);
		e.setEmpPwd(pwd);
		
		
		EmployeeDriver ed = new EmployeeDriver();
		ed.insertEmployee(e);
		
	}

}
