package com.pm.java8;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Eomployee_Comparator_Test {



    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        list.add(new Employee("PM", 10000));
        list.add(new Employee("DD", 5000));
        list.add(new Employee("AA", 10000));

        // Sort by salary
        Collections.sort(list,
                Comparator.comparingInt(Employee::getSalary));

        System.out.println(list);

        // Sort by salary desc
        Collections.sort(list,
                Comparator.comparingInt(Employee::getSalary).reversed());

        System.out.println(list);

        // Salary then name
        Collections.sort(list,
                Comparator.comparingInt(Employee::getSalary)
                          .thenComparing(Employee::getName));

        System.out.println(list);
        
        //////////////////////////////////////////////////////////////////
        Comparator<Employee> c =
                (e1, e2) -> Integer.compare(e1.getSalary(), e2.getSalary());
//meaning is this 
                class $$Lambda$1 implements Comparator<Employee> {
                    public int compare(Employee e1, Employee e2) {
                        return Integer.compare(e1.getSalary(), e2.getSalary());
                    }
                }/////////////////////////////////////////////////////

    }
}
