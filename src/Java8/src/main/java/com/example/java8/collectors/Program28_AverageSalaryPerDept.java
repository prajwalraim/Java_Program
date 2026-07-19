package com.example.java8.collectors;
import java.util.*;
import java.util.stream.Collectors;
public class Program28_AverageSalaryPerDept {
    public static void main(String[] args) {
        List<Employee> emps = Arrays.asList(new Employee("A","IT",3000,2018), new Employee("B","IT",4000,2015), new Employee("C","HR",2500,2019));
        Map<String, Double> m = emps.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.averagingInt(Employee::getSalary)));
        System.out.println(m);
    }
}
