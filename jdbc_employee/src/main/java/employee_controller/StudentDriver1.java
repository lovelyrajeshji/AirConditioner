package employee_controller;

import java.sql.SQLException;
import java.util.Scanner;

import employee_dao.StudentDriver;
import employee_dto.Student;

public class StudentDriver1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Scanner sc = new Scanner(System.in);
		StudentDriver st = new StudentDriver();
		boolean exit = true;
		while (exit) {
			System.out.println("Enter the choice\n1.INSERT\n2.Delete\n3.update\n4.selectAll\n5.Exit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Enter the student Id");
				int studentId = sc.nextInt();
				System.out.println("Enter the student name");
				String studentName = sc.next();
				System.out.println("Enter the student email");
				String studentMail = sc.next();
				System.out.println("Enter the student password");
				int studentMailPwd = sc.nextInt();
				Student s = new Student();
				s.setStudentId(studentId);
				s.setStudentName(studentName);
				s.setStudentMail(studentMail);
				s.setStudentMailPwd(studentMailPwd);
				st.insertStudent(s);
			}
				break;
			case 2: {
				System.out.println("Enter the student Id");
				int id = sc.nextInt();
				st.deleteStudent(id);
			}
				break;
			case 3: {
				System.out.println("Enter the student Id");
				int id = sc.nextInt();
				System.out.println("Enter the student name");
				String studentName = sc.next();
				System.out.println("Enter the student email");
				String studentMail = sc.next();
				System.out.println("Enter the student password");
				int studentMailPwd = sc.nextInt();
				Student s = new Student();
				s.setStudentName(studentName);
				s.setStudentMail(studentMail);
				s.setStudentMailPwd(studentMailPwd);
				s.setStudentId(id);
				st.update(id, s);
			}
				break;
			case 4: {
				System.out.println("Enter the student Id");
				int id = sc.nextInt();
				st.selectAll(id);
			}
			case 5: {
				exit = false;
			}
				break;
			default: {
				System.out.println("Entered incorrect number");
			}
			}
		}

	}

}
