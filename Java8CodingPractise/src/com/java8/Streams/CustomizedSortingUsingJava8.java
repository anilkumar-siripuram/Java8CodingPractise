package com.java8.Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CustomizedSortingUsingJava8 {

	 private static ArrayList<Employee1> getUnsortedEmployeeList() 
	    {
	        ArrayList<Employee1> list = new ArrayList<>();
	        list.add( new Employee1(2l, "Lokesh", "Gupta") );
	        list.add( new Employee1(1l, "Alex", "Gussin") );
	        list.add( new Employee1(4l, "Brian", "Sux") );
	        list.add( new Employee1(5l, "Neon", "Piper") );
	        list.add( new Employee1(3l, "David", "Beckham") );
	        list.add( new Employee1(7l, "Alex", "Beckham") );
	        list.add( new Employee1(6l, "Brian", "Suxena") );
	        return list;
	    }
	
	public static void main(String[] args) {
		
		ArrayList<Employee1> employees = getUnsortedEmployeeList();
		Comparator<Employee1> compareByFirstName = Comparator.comparing( Employee1::getFirstName );
		List<Employee1> sortedEmployees  = employees.stream()
				.sorted(compareByFirstName) //stream of Strings
				.collect(Collectors.toList());//collecting those to an list
		sortedEmployees.forEach(System.out::println);
		
		ArrayList<Employee1> employeesUsingCompare = getUnsortedEmployeeList();
		List<Employee1> sortedEmployees1 = employeesUsingCompare.stream().sorted((emp1,emp2)->emp1.getLastName().compareTo(emp2.getLastName()))
		.collect(Collectors.toList());
		System.out.println(" :::::::::::::::::::::::::::::: ");
		sortedEmployees1.forEach(System.out:: println);
	}

}
