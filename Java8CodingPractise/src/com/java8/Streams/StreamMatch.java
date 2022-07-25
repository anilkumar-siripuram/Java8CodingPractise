package com.java8.Streams;

import java.util.ArrayList;
import java.util.List;

public class StreamMatch {
	
	public static void main(String[] args) {
		
		List<String> matchedList = new ArrayList<String>();
		
		matchedList.add("Anil");
		matchedList.add("chinna");
		matchedList.add("busy");
		matchedList.add("Amrithpal");
		matchedList.add("Suganya");
		matchedList.add("Vasu");
		matchedList.add("Hari");
		
		boolean matchedResult = matchedList.stream().anyMatch((s) ->s.startsWith("H"));
		System.out.println(matchedResult);
		
		
	}

}
