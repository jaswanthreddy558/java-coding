package optional;

import employeeData.Student;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OptionalClass {
    public static void main(String[] args) {
        List<Student> studentList = Stream.of(
                        new Student(1, "John", 28, "Male", "Computer Science", "New York", 85, Arrays.asList("+11234567890", "+19876543210")),
                        new Student(2, "Emily", 22, "Female", "Electrical Engineering", "San Francisco", 92, Arrays.asList("+11234567891", "+19876543211")),
                        new Student(3, "Alexandra", 25, "Female", "Civil Engineering", "Los Angeles", 75, Arrays.asList("+11234567892", "+19876543212")),
                        new Student(4, "Michael Smith", 30, "Male", "Mechanical Engineering", "Chicago", 45, Arrays.asList("+11234567893", "+19876543213")),
                        new Student(5, "Sophia", 23, "Female", "Biotech Engineering", "Boston", 63, Arrays.asList("+11234567894")),
                        new Student(6, "Daniel", 24, "Male", "Chemical Engineering", "Texas", 80, Arrays.asList("+11234567895", "+19876543214")),
                        new Student(7, "Mia", 26, "Female", "Aerospace Engineering", "Seattle", 120, Arrays.asList("+11234567896", "+19876543215")),
                        new Student(8, "William", 31, "Male", "Computer Engineering", "Austin", 150, Arrays.asList("+11234567897", "+19876543216")),
                        new Student(9, "Olivia", 27, "Female", "Software Engineering", "Dallas", 65, Arrays.asList("+11234567898", "+19876543217", "+12345678901")),
                        new Student(10, "Jackson", 26, "Male", "Instrumentation Engineering", "Houston", 110, Arrays.asList("+11234567899", "+19876543218")))
                .collect(Collectors.toList());

        /*
           How would you use the filter operation along with Optional to find a student with a specific age, let's say 25?
         */
        Optional<Student> any = studentList.stream().filter(filterStudentAge -> filterStudentAge.getAge() == 25).findFirst();
        System.out.println(any.get());

        Optional<Integer> first = studentList.stream().map(Student::getId).findFirst();


    }


}

