package com.java8.Streams;

import java.util.Arrays;
import java.util.List;

public class CreateStreamWithListEx {
    public static void main(String[] args) {

        List<String> listofVehicles = Arrays.asList("car","bus","2wheeler");
        listofVehicles.stream().forEach(System.out::println);
    }
}
