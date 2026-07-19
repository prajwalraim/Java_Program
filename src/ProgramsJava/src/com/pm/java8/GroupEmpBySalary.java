package com.pm.java8;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupEmpBySalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<EmployeeFetch> ls = Arrays.asList( new EmployeeFetch("prajwal",5000), new EmployeeFetch("kamath", 6000),
				 new EmployeeFetch("hari",5000));
		
		Map<Double, List<String>> bySalary = ls.stream()
			    .collect(Collectors.groupingBy(EmployeeFetch::getSalary,
			             Collectors.mapping(EmployeeFetch::getName, Collectors.toList())));
		
		
		Map<Double, List<String>> bySalary1 = ls.stream()
			    .collect(Collectors.groupingBy(s->s.getSalary(),
			             Collectors.mapping(EmployeeFetch::getName, Collectors.toList())));


			System.out.println(bySalary);
			System.out.println(bySalary1);

			// {5000.0=[prajwal], 6000.0=[kamath]}


	}

}

class EmployeeFetch {
	private String name;
	private double salary;
	
	public EmployeeFetch(String name, double salary)
	{
		this.name = name;
		this.salary = salary;
		
	}
	
	public String getName()
	{
		return name;
	}
	public double getSalary()
	{
		return salary;
	}
	

}
