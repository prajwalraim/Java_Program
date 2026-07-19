package main.java.com.example.java8.collectors;
import java.util.*;
import java.util.stream.Collectors;
public class Program26_NamesJoinedAfterYear {
    public static void main(String[] args) {
        List<Employee> emps = Arrays.asList(new Employee("A","IT",3000,2018), new Employee("B","HR",4000,2015));
        String names = emps.stream().filter(e->e.getYearJoined()>2016).map(Employee::getName).collect(Collectors.joining(","));
        System.out.println(names);
    }
}
