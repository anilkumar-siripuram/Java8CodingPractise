package com.java8.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamMapExample {

    public static void main(String[] args) {

        List<String> vehicles = Arrays.asList("bus", "car", "bicycle", "flight", "train");
        vehicles.stream().map(String::toUpperCase).forEach(System.out::println);

        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(1,"anilkumar",10000));
        empList.add(new Employee(1,"siripuram",8000));
        empList.add(new Employee(1,"shanvitha",5000));
        empList.add(new Employee(1,"madhu",2000));

        System.out.println("Employee List :: ");
        empList.stream().filter(e->e.getSalary()>4000).map(employee -> employee.getName()).forEach(System.out::println);

    }
}
