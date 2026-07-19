package com.example.java8.streams;
import java.util.*;
import java.util.stream.Collectors;
public class Program16_FrequencyOfEach {
    public static void main(String[] args) {
        List<String> l = Arrays.asList("a","b","a","c","b");
        Map<String,Long> m = l.stream().collect(Collectors.groupingBy(x->x,Collectors.counting()));
        System.out.println(m);
    }
}
