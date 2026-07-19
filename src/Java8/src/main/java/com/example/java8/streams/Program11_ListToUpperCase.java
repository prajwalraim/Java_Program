package com.example.java8.streams;
import java.util.*;
public class Program11_ListToUpperCase {
    public static void main(String[] args) {
        List<String> l = Arrays.asList("a","b","hello");
        l.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
