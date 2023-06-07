package com.glpl.app;

import java.util.Scanner;

import com.glpl.model.Employee;
import com.glpl.service.EmployeeServiceImpl;

public class Driverapp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
     System.out.println("Enter First Name");
		String fName = sc.next();
		System.out.println("Enter Last Name");
		String lName = sc.next();
		
		Employee emp = new Employee();
		emp.setFirstName(fName);
		emp.setLastName(lName);
		EmployeeServiceImpl eim = new EmployeeServiceImpl();
		
		System.out.println("1.Techinal");
		System.out.println("2.Admin");
		System.out.println("3.Hr");
		System.out.println("4.Legal");
		System.out.println("Enter your choice");
		int choice = sc.nextInt();
		String gEmail ="";
		String gPassword = "";
		
		
		switch(choice)
		{ 
		case 1 : gEmail = eim.generateUserEmail(emp.getFirstName().toLowerCase(), emp.getLastName().toLowerCase(), "tech");
		break;
		case 2 : gEmail = eim.generateUserEmail(emp.getFirstName().toLowerCase(), emp.getLastName().toLowerCase(), "admin");
		break;
		case 3 : gEmail = eim.generateUserEmail(emp.getFirstName().toLowerCase(), emp.getLastName().toLowerCase(), "hr");
		break;
		case 4 : gEmail = eim.generateUserEmail(emp.getFirstName().toLowerCase(), emp.getLastName().toLowerCase(), "legal");
		break;
		default : System.out.println("Enter valid option");
		
         }
		gPassword = eim.generateUserPassword();	
		emp.setUserEmail(gEmail);
		emp.setPassword(gPassword);
		eim.displayEmployeeDetails(emp);
		
		}
}

