package com.java8.Streams;

import java.util.ArrayList;
import java.util.List;

public class StreamFindFirst {

	public static void main(String[] args) {

		List<String> memList = new ArrayList<String>();
		memList.add("Anil");
		memList.add("Chinna");
		memList.add("Chinnu");
		memList.add("Yuvan");
		memList.add("Chitti");
		//finds the first matching element.
		String findFirst = memList.stream()
				.filter(s -> s.startsWith("C")) 
				.map(String :: toUpperCase)
				.findFirst().get();
		System.out.println(findFirst);

	}

}
