package com.java8.Streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDistinctEx {

    public static void main(String[] args) {

        Stream<String> list =Stream.of("bus", "car", "bycle", "bus", "car", "car", "bike");

        list.distinct().forEach(System.out::println);

                //.distinct()
                //.forEach(System.out::println);
    }
}
