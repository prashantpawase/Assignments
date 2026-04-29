package com.assignments;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Assignment4a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * 
		 * @param args
		 * @author USER
		 * @version 1.0
		 */

		Map<String,Integer> Emp1 = new Hashtable<String,Integer> ();

			List<String> Employees = new ArrayList<String> ();
			Emp1.put("E001",1);
			Emp1.put("Alice Green",2);
			Emp1.put("30",3);
			Emp1.put("Female",4);
			Emp1.put("Engineering",5);
			Emp1.put("Software Engineer",6);
			Emp1.put("75,000",7);
			Emp1.put("alice@example.com",8);
			Emp1.put("9876543213",9);

			Map<String,Integer> Emp2 = new Hashtable<String,Integer> ();
			
			Emp2.put("E002",1);
			Emp2.put("Bob Johnson",2);
			Emp2.put("33",3);
			Emp2.put("Male",4);
			Emp2.put("Marketing",5);
			Emp2.put("Marketing Manager",6);
			Emp2.put("85,000",7);
			Emp2.put("bob@example.com",8);
			Emp2.put("9876543214",9);

			Map<String,Integer> Emp3 = new Hashtable<String,Integer> ();
			
			Emp3.put("E003",1);
			Emp3.put("Carol White",2);
			Emp3.put("28",3);
			Emp3.put("Female",4);
			Emp3.put("Sales",5);
			Emp3.put("Sales Executive",6);
			Emp3.put("65,000",7);
			Emp3.put("carol@example.com",8);
			Emp3.put("9876543215",9);

			List<Map<String,Integer>> data = new ArrayList<Map<String,Integer>> ();
			
			data.add(Emp1);
			data.add(Emp2);
			data.add(Emp3);
			
			System.out.println(data.get(1).containsValue(8));

		
		}

	}


