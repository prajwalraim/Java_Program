package com.example.java8.collectors;
import java.util.*;
public class Program25_SecondHighestSalary {
    public static void main(String[] args) {
        List<Integer> s = Arrays.asList(100,200,300,400);
        Integer second = s.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
        System.out.println(second);
    }
}
