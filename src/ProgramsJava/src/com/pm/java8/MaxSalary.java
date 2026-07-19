package com.pm.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MaxSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> ls = Arrays.asList(new Employee("pm",100),new Employee("fg",200));
		System.out.println(ls.stream().max(Comparator.comparingDouble(Employee::getSalary)).get());

		
		
		Double ss = ls.stream().mapToDouble(s->s.getSalary()).max().orElse(0.0);
		System.out.println(ss);
		Optional<Employee> e = ls.stream().max(Comparator.comparing(Employee::getSalary));
		e.ifPresent(s->System.out.println(s.getName()));
		
		String nm = e.map(Employee::getName).orElse(null);
		
		System.out.println("map in optional --"+nm);

		List<Double> opp = ls.stream().map(s->s.getSalary()*2).collect(Collectors.toList());
		System.out.println("hh"+opp);
		Optional<Employee> op = ls.stream().max(Comparator.comparing(Employee::getSalary));
		
		
		Employee em = ls.stream().max(Comparator.comparing(Employee::getSalary)).orElse(null);
		System.out.println(em.getName());
		
		
        Collections.sort(ls, Comparator.comparing(Employee::getSalary).reversed());
        System.out.println(ls);
		

	}

}
