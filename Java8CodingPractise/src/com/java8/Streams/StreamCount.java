package com.java8.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCount {

	public static void main(String[] args) {		
		List<Integer> numberList = new ArrayList<Integer>();
		
		for(int i=0;i<30;i++) {
			numberList.add(i);
		}
		
		List<Integer> numberListex = Arrays.asList(1,4,6,3,7,9,2,3,5,7);
		List<Integer> evenList = numberListex.stream().filter(i ->i%2 ==0).collect(Collectors.toList());
		evenList.forEach(System.out :: println);
		
		
		Stream<Integer> stream = numberList.stream(); // list conversion to Stream
		
		long evenNumCount = stream.filter( i -> i%2 == 0).count();//it will print the even numbers
		
		System.out.println(evenNumCount);
		
		//Once we traverse through the stream if we try to traverse again we will get the
		// following error : "stream has already been operated upon or closed"
		
	//	long oddNumber = stream.filter( i->i%2 ==0).count();
		
		//System.out.println("OddNumber"+oddNumber);

	}

}
