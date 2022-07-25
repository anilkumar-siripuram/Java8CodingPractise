package com.java8.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamToArray {

	public static void main(String[] args) {
		
		List<Integer> listArray = new ArrayList<Integer>();
		
		for(int i=0;i<30;i++) {
			listArray.add(i);
		}
		
		Stream<Integer> arrayStream = listArray.stream();
		Integer[] evenArray = arrayStream.filter(i-> i%2 == 0).toArray(Integer[] :: new);
		for(int evenElements : evenArray) {
			System.out.print("..."+evenElements);
		}
		
	}

}
