package com.example.java8.collectors;
import java.util.*;
import java.util.stream.Collectors;
public class Program27_LongestNameEmployee {
    public static void main(String[] args) {
        List<Employee> emps = Arrays.asList(new Employee("Alexandra","IT",3000,2018), new Employee("Bob","HR",4000,2015));
        Employee e = emps.stream().max(Comparator.comparingInt(em->em.getName().length())).get();
        System.out.println(e);
    }
}
