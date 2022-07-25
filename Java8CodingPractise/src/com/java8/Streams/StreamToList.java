package com.java8.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0;i<30;i++) {
			list.add(i);
		}

		//Converting list to stream .
		Stream<Integer> stream = list.stream();
		
		//Even numbers in the stream
		
		List<Integer> evenNumber = stream.filter(i->i%2 == 0).collect(Collectors.toList());		
		System.out.println(evenNumber);
	
	
	}

}
