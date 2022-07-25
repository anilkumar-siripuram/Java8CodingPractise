package com.java8.Concurrancy;

public class SingletonDemo {

    private static SingletonDemo singletonDemo = null;
    private SingletonDemo(){

    }

    public static SingletonDemo getInstance(){
        if(singletonDemo == null){
            singletonDemo = new SingletonDemo();
        }
        return singletonDemo;
    }


    public static void main(String[] args) {

        SingletonDemo first = SingletonDemo.getInstance();

        SingletonDemo second = SingletonDemo.getInstance();

        SingletonDemo third = SingletonDemo.getInstance();

        System.out.println("first :: "+first+"  :: second :: "+second+" :: "+third);



        //first :: SingletonDemo@28d93b30  :: second :: SingletonDemo@28d93b30 :: SingletonDemo@28d93b30
        //all the Object refference is same so it will be single Object for the JVM



    }
}
