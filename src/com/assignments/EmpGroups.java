package com.assignments;

public class EmpGroups extends Employees{

	/**
	 * 
	 * @param args
	 * @author USER
	 * @version 1.0
	 * @throws Arrayindexoutofboundsexception
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * print each employee's
name along with their corresponding ID.
Example:
• Employee Name: Bharath, Employee ID: 1234
		 */
		EmpGroups eg = new EmpGroups();
		System.out.println("Employee Name: " + eg.EmpNames[0]+" , "+ "Employee ID:"+ eg.EmpIds[0]);
		System.out.println("Employee Name: " + eg.EmpNames[1]+" , "+ "Employee ID:"+ eg.EmpIds[1]);
		
	}

}
