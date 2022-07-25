package com.java8.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamFilter {

	public static void main(String[] args) {
		 		
		Predicate<String> predicate =(s)->s.startsWith("A"); 		
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Lokesh");
		
	//	System.out.println("Anilkumar");
		
		//filter accepts the predicate
		Stream<String> startwithA = memberNames
				.stream() // list to stream conversion
				.filter(predicate) //filter((s) -> s.startsWith("A"));
				.map(String :: toUpperCase);
		startwithA.forEach(System.out ::println);
	
		
	}
	
}
