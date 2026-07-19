package main.java.com.example.java8.collectors;

public class Employee {
	private String name;
	private String dept;
	private int salary;
	private int yearJoined;

	public Employee(String name, String dept, int salary, int yearJoined) {
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	//aaa	this.yearJoined = yearJoined;
	}

	public String getName() {
		return name;//
	}
//hello
//
	public String getDept() {
		return dept;
	}

	public int getSalary() {
		return salary;
	}

	public int getYearJoined() {
		return yearJoined;
	}

	@Override
	public String toString() {
		return name + "(" + dept + "," + salary + ")";
	}
}//gettttt
//baba vv
//vkgg
//baby}
