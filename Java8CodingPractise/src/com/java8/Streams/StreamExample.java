package com.java8.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
	
	public static void main(String[] args) {
		
		//conversion of stream to list.
		
		List<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i< 10; i++){
            list.add(i);
        }
        Stream<Integer> stream = list.stream();
        List<Integer> evenNumbersList = stream.filter(i -> i%2 == 0).collect(Collectors.toList());
        System.out.print(evenNumbersList);
        
        //conversion of Stream to Array (Stream.toArray( EntryType[]::new )
        
        List<Integer> listtoArray = new ArrayList<Integer>();
        for(int i = 1; i< 10; i++){
        	listtoArray.add(i);
        }
        Stream<Integer> Arraystream = listtoArray.stream();
        Integer[] evenNumbersArray = Arraystream.filter(i -> i%2 == 0).toArray(Integer[] :: new);
        //System.out.println(evenNumbersArray);
        
        for(int i=0;i<evenNumbersArray.length-1;i++) {
        	System.out.println("..."+evenNumbersArray[i]);
        }
        
        
        //Intermediate operations which itself return the List of Values.
        // filter()
        
        List<String> memberNames = new ArrayList<>();
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("Rahul");
        memberNames.add("Shahrukh");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokesh");
        System.out.println("Starts with A..");
        memberNames.stream().filter(s->s.startsWith("A")).forEach(System.out :: println);
        
        //stream.Map()
        //The intermediate operation map converts each element into another object via the given function. 
        //here the matching things can convert the things into a new String Object.
        memberNames.stream().filter(s->s.startsWith("A")).map(String :: toUpperCase).forEach(System.out ::println);
        
        //Stream.sorted
        // it will return the sorted view of the stream.
        
        System.out.println("SOrted values ..");
        memberNames.stream().sorted().map(String :: toUpperCase).forEach(System.out :: println);
        
        //Stream.count()
        // it will return the count of the Element.
        long matchedCount = memberNames.stream().filter(s->s.startsWith("A")).count();
        System.out.println("Count of the Matched ....."+matchedCount);
        
        
        //forEach vs forEachOrderd()
        
        List<Integer> listofIntegers = Arrays.asList(2, 4, 6, 8, 10);
        
        listofIntegers.stream().parallel().forEach( System.out::print );        //1 
        //order of the elements in stream are not guarented that they can be in a Order.
        System.out.println();
         
        //forEachOrdered () : respects the the encounter order.
        
        listofIntegers.stream().parallel().forEachOrdered( System.out::print ); //2
        
        
        //Traverse and print all elements in reverse order 
        
        List<Integer> listOfElements = Arrays.asList(1,5,9,3,10);
        System.out.println();
        System.out.println("Reverse Order..");
        
       // listOfElements.stream().sorted(Comparator.reverseOrder()).forEachOrdered(System.out :: println);
        listOfElements.stream().sorted(Comparator.reverseOrder()).forEach(System.out :: print);
        
        
	}

}
