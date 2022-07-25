package com.java8.Concurrancy;

public final class ImmutableClassExample { // declare a class as a final

    //Make all fields private so that direct access is not allowed.
    private final int id;

    private final String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    //Don’t provide setter methods for variables.
    //Make all mutable fields final so that its value can be assigned only once.
    //Initialize all the fields via a constructor performing deep copy.
    ImmutableClassExample(int id,String name){
        this.id=id;
        this.name=name;
    }

    public static void main(String[] args) {

        ImmutableClassExample ex1 = new ImmutableClassExample(101,"anil");
        System.out.println("id  :: "+ex1.getId()+"  ::  name :: "+ex1.getName());


    }
}
