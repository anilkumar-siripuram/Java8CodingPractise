package com.java8.Concurrancy;

import java.util.Arrays;
import java.util.List;

public class SplitIteratorDemo {

    public static void main(String[] args) {
        List<String> languages = Arrays.asList("Java", "C", "C++", "Python", "Scala", "Kotlin");
        languages.spliterator().tryAdvance(System.out :: println); //Performs the given action on next element. It is used to traverse the elements one by one.

        //Performs the given action on each of the remaining elements. It is used to traverse the elements in bulk.
        languages.spliterator().forEachRemaining(System.out :: println);
    }
}
