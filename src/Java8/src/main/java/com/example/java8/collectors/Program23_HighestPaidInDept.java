package main.java.com.example.java8.collectors;

import java.util.*;
import java.util.stream.Collectors;

public class Program23_HighestPaidInDept {
	public static void main(String[] args) {
		List<Employee> emps = Arrays.asList(new Employee("A", "IT", 3000, 2018), new Employee("B", "IT", 4000, 2015),
				new Employee("C", "HR", 2500, 2019));
		Map<String, Optional<Employee>> m = emps.stream().collect(Collectors.groupingBy(Employee::getDept,
				Collectors.maxBy(Comparator.comparingInt(Employee::getSalary))));
		System.out.println(m);
	}
}
