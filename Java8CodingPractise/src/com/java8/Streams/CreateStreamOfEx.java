package com.java8.Streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class CreateStreamOfEx {

    public static void main(String[] args) {

        //stream we can create in 3 ways
        // stream.of() and converting the list to Stream and stream.generate()

        //creating the Integer Stream
        Stream<Integer> intStream = Stream.of(1,3,4,7,8);
        intStream.forEach(System.out::println);

        //create stream using array of elements
        Stream<Integer> intStream1 = Stream.of(new Integer[]{1,4,7,9,3});
        intStream1.forEach(System.out::println);

        int[]  intArray = new int[]{1,6,4,9,10};
        System.out.println("Sorted arrays ::");
        Arrays.sort(intArray);
        System.out.println(" first "+intArray[intArray.length-1]);
        System.out.println("  second highest::" + intArray[intArray.length-2]);




    }
}
