package com.assignments;

import java.util.ArrayList;
import java.util.List;

public class Assignment4 {
	
	/**
	 * 
	 * @param args
	 * @author USER
	 * @version 1.0
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> Employees = new ArrayList<String> ();
		Employees.add("E001");
		Employees.add("Alice Green");
		Employees.add("30");
		Employees.add("Female");
		Employees.add("Engineering");
		Employees.add("Software Engineer");
		Employees.add("75,000");
		Employees.add("alice@example.com");
		Employees.add("9876543213");

		Employees.add("E002");
		Employees.add("Bob Johnson");
		Employees.add("33");
		Employees.add("Male");
		Employees.add("Marketing");
		Employees.add("Marketing Manager");
		Employees.add("85,000");
		Employees.add("bob@example.com");
		Employees.add("9876543214");
		
		Employees.add("E003");
		Employees.add("Carol White");
		Employees.add("28");
		Employees.add("Female");
		Employees.add("Sales");
		Employees.add("Sales Executive");
		Employees.add("65,000");
		Employees.add("carol@example.com");
		Employees.add("9876543215");

		
		System.out.println(Employees.get(16));
	
	}

}
