package com.assignments;



public class Assignment2 {
	/*
	Problem: Multi-Dimensional Array Practice
	1. Create a 3D array to represent the following data:
	o Semesters as the first dimension.
	o Subjects and Marks as the second dimension.
	o Actual values for Subject Names and Marks as the third dimension.
	2. From the array:
	o Print Semester 3 - Subject 4 and Subject 5 Names.
	o Print Semester 5 - Subject 3 and Subject 6 marks
*/
	
	/**
	 * 
	 * @param args
	 * @author USER
	 * @version 1.0
	 * @throws Indexoutofbondexception
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String[][][] Annual = {
				{
					{"Sem 1", "Mathematics I", "Physics", "Chemistry" ,"Computer Programming", "Engineering Drawing"," Basic Electrical Eng."},
					{"78", "85", "91", "74", "88", "79"}

				},
				{
					{"Sem 2", "Mathematics II", "Mechanics"," Environmental Sci."," Basic Electronics" ,"Engineering Physics"," Engineering Graphics"},

					{"82", "77", "93", "69", "84", "90"}
			},
				{
				
				{"Sem 3", "Data Structures", "Discrete Mathematics","Digital Electronics", "Operating Systems", "Signals and Systems", "Object-Oriented Prog."},

				{"88", "81", "76", "92", "85", "78"}
				
				},
				
				{
					
					{"Sem 4", "Algorithms", "Computer Networks", "Database Systems", "Microprocessors", "Communication Eng.", "Software Engineering"},

					{"91", "73" ,"89", "80", "76", "87"}
					
				},
				{
					{"Sem 5" ,"Probability & Stats","Machine Learning", "Compiler Design", "Theory of Computation", "Embedded Systems", "Computer Graphics"},

					{"86", "88", "84", "95", "73", "90"}
				}			
				
			};
		
/*		From the array:
			o Print Semester 3 - Subject 4 and Subject 5 Names.
			
			*/

		
		System.out.println("Print Semester 3 - Subject 4 Name. = "+ Annual[2][0][4]);	
		System.out.println("Print Semester 3 - Subject 5 Name. = "+ Annual[2][0][5]);
		
	/*	From the array:
			o Print Semester 5 - Subject 3 and Subject 6 marks
			
			*/
		
		System.out.println("Print Semester 5 - Subject 3 marks = "+ Annual[4][1][2]);	
		System.out.println("Print Semester 5 - Subject 6 marks = "+ Annual[4][1][5]);
	}

}
