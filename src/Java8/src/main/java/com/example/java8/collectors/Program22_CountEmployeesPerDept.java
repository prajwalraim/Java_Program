package com.example.java8.collectors;
import java.util.*;
import java.util.stream.Collectors;
public class Program22_CountEmployeesPerDept {
    public static void main(String[] args) {
        List<Employee> emps = Arrays.asList(new Employee("A","IT",3000,2018), new Employee("B","HR",4000,2015), 
        		new Employee("C","IT",2500,2019));
        Map<String,Long> m = emps.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.counting()));
        System.out.println(m);
    }
}
//hhhhhhhhhss vv gdd
//fff
