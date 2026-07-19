package com.pm.java8.big;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

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
 public class Employee
 {
	 public static void main(String[] args)
	 {
		 List<EmployeeFetch> ls = Arrays.asList(
				 new EmployeeFetch("prajwal",5000),
				 new EmployeeFetch("kamath", 6000)
				 );
		Function<EmployeeFetch,String> emp = EmployeeFetch::getName;
	 ls.stream().filter(l-> l.getSalary()>5000).map(emp).forEach(e->System.out.println(e));
	 
	 
	 List<EmployeeFetch> a = ls.stream().filter(l-> l.getSalary()>5000).collect(Collectors.toList());
	 a.forEach(ll->System.out.println(ll.getName()+"------"+ll.getSalary()));

		 
		 ls.stream().filter(l-> l.getSalary()>5000).map(EmployeeFetch::getName).forEach(e->System.out.println(e));
	 
	 ls.stream().filter(c->c.getSalary()>4000).forEach(e->System.out.println(e.getName()+"-----"+e.getSalary()));
	 }
	 
 }
