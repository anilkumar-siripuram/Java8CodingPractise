package com.java8.Concurrancy;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordCountExample {

    public static void main(String[] args) {

        String str = "hi hello java user java is language java is pretty much simple";
        List<String> list = Stream.of(str).map(w->w.split(" ")).flatMap(Arrays::stream).collect(Collectors.toList());
        Map<String,Integer> wordCount = list.stream(). // converting the list to stream
                collect(Collectors.toMap(w->w.toLowerCase(),w->1,Integer::sum));//w->w.toLowerCase() KeyMapper w->1 value mapper
        System.out.println("  :: "+wordCount);
    }
}
