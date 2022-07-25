package com.java8.Streams;

public class Employee {

    private int id;
    private String name;
    private Integer Salary;

    public Employee(int id, String name, Integer salary) {
        this.id = id;
        this.name = name;
        Salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getSalary() {
        return Salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(Integer salary) {
        Salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Salary=" + Salary +
                '}';
    }
}
