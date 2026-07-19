package com.example.java8.collectors;
import java.util.*;
public class Program29_DistinctElements {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,2,2,3,1);
        l.stream().distinct().forEach(System.out::println);
    }
}
//sn