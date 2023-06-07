package com.glpl.service;

import java.util.Random;
import java.util.RandomAccess;
import java.util.random.RandomGenerator;

import com.glpl.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public String generateUserEmail(String firstName, String lastName, String departmentName) {
		// TODO Auto-generated method stub
		return firstName + lastName + "@" + departmentName +".glpl.com";
	}

	@Override
	public String generateUserPassword() {
		String caps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower = "abcdefghijklmnopqrstuvwxyz";
		String nums = "1234567890";
		String spchar = "!@#$%^&*()";
		String combined = caps + lower + nums + spchar;
		System.out.println(combined.length());
		String genPass = "";
	    Random random = new Random();
		for(int i=1; i<=8; i++)
		{
			genPass += String.valueOf(combined.charAt(( random).nextInt(combined.length())));
			
		}
		return genPass;
	}

	@Override
	public String displayEmployeeDetails(Employee e1) {
		// TODO Auto-generated method stub
		System.out.println("Employee firstName is" +e1.getFirstName());
		System.out.println("Employee lasttName is" +e1.getLastName());
		System.out.println("Employee Email Id is" +e1.getUserEmail());
		System.out.println("Employee Password is" +e1.getPassword());
		return null;
	}

}
