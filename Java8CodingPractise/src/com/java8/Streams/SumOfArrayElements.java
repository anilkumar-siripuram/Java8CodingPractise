package com.java8.Streams;

import java.util.stream.IntStream;

public class SumOfArrayElements {

	public static void main(String[] args) {
		
		int[] A = { 1, 2, 3, 4, 5,-1 };
		int[] B = { 1, 2, 3, 4, 5,-1 };
		System.out.println("Sum of the elements :: "+IntStream.of(A).sum());
		
		long sum = IntStream.of(B).summaryStatistics().getMax();
		System.out.println(sum);
	}
}
