package com.example.java8.collectors;
import java.util.*;
import java.util.stream.Collectors;
public class Program30_CollectOddToSet {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,2,3,4,5);
        Set<Integer> s = l.stream().filter(x->x%2!=0).collect(Collectors.toSet());
        System.out.println(s);
    }
}
ff