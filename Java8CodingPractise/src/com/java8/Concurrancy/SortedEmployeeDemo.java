package com.java8.Concurrancy;

import java.util.ArrayList;
import java.util.List;

public class SortedEmployeeDemo {
    public static void main(String[] args) {

        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee("Nataraja G", "Accounts", 8000));
        empList.add(new Employee("Nagesh Y", "Admin", 15000));
        empList.add(new Employee("Vasu V", "Security", 2500));
        empList.add(new Employee("Amar", "Entertainment", 12500));

       empList.stream().sorted((e1,e2)->e1.getSalary().compareTo(e2.getSalary())).forEach(System.out ::println);

       // HashSet

    }
}
