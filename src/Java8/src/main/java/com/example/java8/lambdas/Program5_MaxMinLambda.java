package main.java.com.example.java8.lambdas;
import java.util.*;
public class Program5_MaxMinLambda {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(10,20,5,40);
        System.out.println("Max: "+l.stream().max(Integer::compare).get());
        System.out.println("Min: "+l.stream().min(Integer::compare).get());
    }
}
