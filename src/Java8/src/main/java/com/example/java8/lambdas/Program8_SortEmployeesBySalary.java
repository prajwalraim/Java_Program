package main.java.com.example.java8.lambdas;

import java.util.*;

class Emp {
	String name;
	int sal;

	Emp(String n, int s) {
		name = n;
		sal = s;
	}

	public String toString() {
		return name + ":" + sal;
	}

	public int getSal() {
		return sal;
	}
}

public class Program8_SortEmployeesBySalary {
	public static void main(String[] args) {
		List<Emp> emps = Arrays.asList(new Emp("A", 3000), new Emp("B", 2000), new Emp("C", 4000));
		emps.sort((a,b)-> Integer.compare(a.getSal(), b.getSal()));
		System.out.println(emps);
	}
}
