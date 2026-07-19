package com.pm.java8;

public class Comparable_Epmoyee implements Comparable<Comparable_Epmoyee>{


     String name;
     int salary;

    // constructor
    public Comparable_Epmoyee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    // getters
    public String getName() { return name; }
    public double getSalary() { return salary; }

    @Override
    public String toString() {
        return name + " - " + salary;
    }

	@Override
	public int compareTo(Comparable_Epmoyee o) {
		// TODO Auto-generated method stub
		
		return this.salary - o.salary;
	}
}
