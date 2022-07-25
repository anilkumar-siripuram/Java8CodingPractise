package com.java8.Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamMaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer maxNumber = Stream.of(1, 22, 3, 4, 5, 6, 7, 8, 9)
                .max(Comparator.comparing(Integer::valueOf))
                .get();
		System.out.println(maxNumber);
		
		Integer minNum = Stream.of(4,6,2,9,5).min(Comparator.comparing(Integer :: valueOf)).get();
		System.out.println(minNum);
		
		
		
		List<Integer> list = Arrays.asList(1,3,4,5,2,8,9,3,6,10,23,21,5);
		
		Optional<Integer> value = list.stream().sorted(Collections.reverseOrder()).limit(2).skip(1).findFirst();
		 
		System.out.println("2nd highest ..."+value);
		
	}

	
	
}
