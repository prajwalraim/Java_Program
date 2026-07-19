package main.java.com.example.java8.streams;

import java.util.*;
import com.example.java8.collectors.Employee;

public class Program17_MaxSalary {
	public static void main(String[] args) {
		List<Employee> emps = Arrays.asList(new Employee("A", "IT", 3000, 2018), new Employee("B", "HR", 4000, 2015));
		System.out.println(emps.stream().max(Comparator.comparingInt(Employee::getSalary)).get());
	}
}
