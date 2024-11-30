package employee_dto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Employee {
	
	  int empId;
	  String name;
	  String  empMail;
	  int empPwd;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmpMail() {
		return empMail;
	}
	public void setEmpMail(String empMail) {
		this.empMail = empMail;
	}
	public int getEmpPwd() {
		return empPwd;
	}
	public void setEmpPwd(int empPwd) {
		this.empPwd = empPwd;
	}
	  
	}
   
