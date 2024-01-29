package org.example.IntermediateOperations;

import employeeData.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilterConcept {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 12, 23, 24, 25, 26);
        list.stream().filter(integer -> integer % 2 == 0).collect(Collectors.toList()).forEach(System.out::println);
        List<Employee> employeeList = Arrays.asList(
                new Employee("Vijay Reddy", 30000),
                new Employee("Amit Shah", 60000),
                new Employee("Sara Khan", 50000),
                new Employee("Amit Shah", 40000));


        employeeList.stream().sorted(Comparator.comparing(Employee::getName, Comparator.reverseOrder()).thenComparing(Employee::getSalary, Comparator.reverseOrder())).collect(Collectors.toList()).forEach(System.out::println);
        List<Employee> amit = employeeList.stream().filter(employee -> employee.getName().equalsIgnoreCase("Amit Shah")).collect(Collectors.toList());
        System.out.println(amit);


    }
}
