package main.java.com.example.java8.streams;

public class Employee {
    private String name;
    private String department;
    private double salary;
    private int yearOfJoining;

    // Constructor
    public Employee(String name, String department, double salary, int yearOfJoining) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.yearOfJoining = yearOfJoining;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    // Optional: toString() for easy printing
    @Override
    public String toString() {
        return name + " (" + department + ", " + salary + ", " + yearOfJoining + ")";
    }
}
