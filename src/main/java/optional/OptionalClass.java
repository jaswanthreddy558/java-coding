package optional;

import employeeData.Employee;

import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args) {
        Employee employee = new Employee("Jaswanth", 123.25);
        Optional<String> name = Optional.ofNullable(employee.getName());
        System.out.println("Value of the name is +  " + name);

    }


}

