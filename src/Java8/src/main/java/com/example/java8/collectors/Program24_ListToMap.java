package main.java.com.example.java8.collectors;
import java.util.*;
import java.util.stream.Collectors;
public class Program24_ListToMap {
    public static void main(String[] args) {
        List<Employee> emps = Arrays.asList(new Employee("A","IT",3000,2018), new Employee("B","HR",4000,2015));
        Map<String, Integer> m = emps.stream().collect(Collectors.toMap(Employee::getName, Employee::getSalary));
        
        
        
        Map<String,Integer> ks = emps.stream().collect(Collectors.toMap(Employee::getName, Employee::getYearJoined));
        System.out.println(ks);
    }
}
//first
//aug1