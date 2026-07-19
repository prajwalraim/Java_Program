package main.java.com.example.java8.streams;
import java.util.*;
import java.util.stream.Collectors;
public class Program18_GroupByDepartment {
    public static void main(String[] args) {
        List<Employee> emps = Arrays.asList(new Employee("A","IT",3000,2018), new Employee("B","HR",4000,2015), new Employee("C","IT",2500,2019));
        Map<String, List<Employee>> m = emps.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println(m);
    }
}
