package com.java8.Streams;

import java.util.stream.Stream;

public class StreamReduceExample {

    public static void main(String[] args) {

        Stream.of(10,20,30,40).reduce(Integer::sum).ifPresent(System.out::println);
        Stream.of(10,20,40,56).reduce((x,y)->x+y).ifPresent(System.out::println);
    }
}
