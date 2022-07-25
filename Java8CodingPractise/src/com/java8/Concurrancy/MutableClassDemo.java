package com.java8.Concurrancy;

public class MutableClassDemo {

    private final String  firstName;
    private final String  lastName;
    //make the variables as private final
    //don't provide the setters

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


    //provide the paramaterized constructor

    public MutableClassDemo(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }

    //Data members in the class must be declared private so that direct access is not allowed.
    //provide the Parameterized constructor

    public static void main(String[] args) {

        MutableClassDemo mutableClassDemo = new MutableClassDemo("anil","siripuram");
        System.out.println("firstName :: "+mutableClassDemo.getFirstName()+" :: LastName ::"+mutableClassDemo.getLastName());

        //CVRG_EFCTV_DT

    }
}
