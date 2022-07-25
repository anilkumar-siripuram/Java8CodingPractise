package com.java8.Streams;

import java.util.ArrayList;
import java.util.List;

public class StreamFilterExample {

    public static void main(String[] args) {

        //filter accept Pedicate Functional Interface

        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(1,"anilkumar",10000));
        empList.add(new Employee(1,"siripuram",8000));
        empList.add(new Employee(1,"shanvitha",5000));
        empList.add(new Employee(1,"madhu",2000));

        empList.stream().filter(e->e.getSalary()>5000).forEach(System.out::println);


    }
}
