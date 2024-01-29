package org.example.IntermediateOperations;

import employeeData.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedConcept {
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
                new Employee("Vijay Reddy", 30000),
                new Employee("Amit Shah", 60000),
                new Employee("Sara Khan", 50000),
                new Employee("Amit Shah", 40000));
        //ascending order
        List<Employee> collect = list.stream().sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary)).collect(Collectors.toList());
        collect.forEach(System.out::println);


        //reverse order



    }
}
