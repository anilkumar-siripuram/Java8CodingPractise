package com.java8.Streams;

import java.util.ArrayList;
import java.util.List;

public class StreamMap {

	public static void main(String[] args) {

		List<String> memberNamesMapEx = new ArrayList<>();
		memberNamesMapEx.add("Amitabh");
		memberNamesMapEx.add("Shekhar");
		memberNamesMapEx.add("Aman");
		memberNamesMapEx.add("Rahul");
		memberNamesMapEx.add("Shahrukh");
		memberNamesMapEx.add("Salman");
		memberNamesMapEx.add("Yana");
		memberNamesMapEx.add("Lokesh");

		memberNamesMapEx.stream().filter((s) -> s.startsWith("A")). // stream of string filtered Values
				map(String::toUpperCase) // stream of Strings
				.forEach(System.out::println);

	}

}
