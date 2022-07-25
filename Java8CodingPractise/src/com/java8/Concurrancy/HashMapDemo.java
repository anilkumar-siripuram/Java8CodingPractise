package com.java8.Concurrancy;

import java.util.*;
import java.util.stream.Stream;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap<String,Integer> hmap = new HashMap<>();
        hmap.put("Anil",456);
        hmap.put("Siripuram",687);
        hmap.put("hyderabad",985);
        hmap.put("Karimnagar",125);

        hmap.forEach((k,v)->{
            System.out.println("key :: "+k+" :: value :: "+v);
        });

        System.out.println("List Values :: ");

        List<String> namesList = Arrays.asList("Anil","siripuram","hyderabad","karimnagar","abhinay");
        namesList.stream().sorted(Comparator.reverseOrder()).forEach(System.out ::println);

        int[] integers = new int[] { 20, 98, 12, 7, 35 };
        int minNumber = Arrays.stream(integers).min().getAsInt();
        System.out.println("minNumber ::  "+minNumber);

        Double avg = Arrays.stream(integers).average().getAsDouble();
        System.out.println("Average :: "+avg);
        // Object PRESENT = new Object();
        //public boolean add(E e) {
        //        return map.put(e, PRESENT)==null;
        //    }
    }
}
