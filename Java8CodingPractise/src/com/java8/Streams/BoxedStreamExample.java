package com.java8.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BoxedStreamExample {

	public static void main(String[] args) {

		// convert int stream to List of Integers.
		// To convert a stream of primitives, you must first box the elements in their
		// wrapper class and then collect them.

		List<Integer> ints = IntStream.of(1, 3, 6, 2, 9).boxed().collect(Collectors.toList());
		System.out.println(ints);
		
		List<Integer> intList1 = Arrays.asList(1,4,6,33,8,9,2);
		Optional<Integer> maxList = intList1.stream().max(Integer :: compareTo);
		System.out.println("maxList.get() :: "+maxList.get());

		// To find the Maximum Number
		Optional<Integer> max = IntStream.of(1, 5, 6, 3, 9, 2).boxed().max(Integer::compareTo);
		
		OptionalInt maxNumber = IntStream.of(1,5,8,3,9).max();
		System.out.println("maxNumber.getAsInt() :: "+maxNumber.getAsInt());

		System.out.println("Max Number is" + max);

		Optional<Integer> min = IntStream.of(1, 5, 6, 3, 9, 2).boxed().min(Integer::compareTo);

		System.out.println("Min Number is" + min);

		// If you already have the array of ints, there is not quick way to convert,
		// you're better off with the loop.
		// On the other hand, if your array has Objects, not primitives in it,
		// Arrays.asList will work:
		// Arrays.asList() will work on Objects not on Primitives.
		Integer[] s = { 1, 4, 6, 8, 3 }; //
		List<Integer> intList = Arrays.asList(s);
		System.out.println(intList);

	}

}
