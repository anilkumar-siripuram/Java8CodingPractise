package com.java8.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamSortedEx {

    public static void main(String[] args) {

        Stream.of("delhi","bus", "car", "bicycle", "flight", "train")
                .sorted()
                .forEach(System.out::println);

        System.out.println("-------------------------");

        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(1,"anilkumar",10000));
        empList.add(new Employee(1,"siripuram",8000));
        empList.add(new Employee(1,"shanvitha",5000));
        empList.add(new Employee(1,"madhu",2000));

        System.out.println(" ::  Employee Sorted :: ");
        
        empList.stream().sorted((e1,e2)->e1.getName().compareTo(e2.getName())).forEach(System.out::println);

    }
}
