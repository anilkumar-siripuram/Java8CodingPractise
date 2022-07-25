package com.java8.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamSorted {

	public static void main(String[] args) {
		
		
		Integer[] arrayOfElements = {1,2,6,3,9,5};
		
		List<Integer> listarrayOfElements = Arrays.asList(arrayOfElements);
		
		int MaxNumber = listarrayOfElements.stream().sorted().max(Comparator.comparing(Integer :: valueOf)).get();
		
		System.out.println("Max Number....."+MaxNumber);
		// TODO Auto-generated method stub
		 
		String namesArray[] = {"X","A","C","B"};
		//converting an array to list using Arrays.asList();
		//if we didnt initalise the array by using new Arraylist if we try to modify the list we will get 
		// the following excpetion. "java.lang.UnsupportedOperationException"
		
		List<String> namesList = Arrays.asList(namesArray);
		//namesList.add("F");
		
	// To overcome the above exception we can create the list Object and pass Arrays.asList() as parameter to the list.
	// like below "List<String> namesList = new ArrayList(Arrays.asList(namesArray));"
	// here new Arraylist Object is created we can do modification on this object like add,delete the elements	
		
	//	namesList.add("F");
		System.out.println("Names sorting");
		namesList.stream().sorted().forEach(System.out :: println);
		
		
		List<String> memberNamessorted = new ArrayList<>();
		memberNamessorted.add("Amitabh");
		memberNamessorted.add("Shekhar");
		memberNamessorted.add("Aman");
		memberNamessorted.add("Rahul");
		memberNamessorted.add("Shahrukh");
		memberNamessorted.add("Salman");
		memberNamessorted.add("Yana");
		memberNamessorted.add("Lokesh");
		memberNamessorted.add("Anil");
		
		memberNamessorted.stream().sorted().map(String ::toUpperCase).forEach(System.out :: println);

	}

}
