package streamAPI;

import java.util.ArrayList;

public class StudentFilter {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(101, "Haritha", 85));
        students.add(new Student(102, "Rahul", 45));
        students.add(new Student(103, "Priya", 72));
        students.add(new Student(104, "Kiran", 50));
        students.add(new Student(105, "Anjali", 38));

        long count = students.stream()
                             .filter(student -> student.getMark() >= 50)
                             .count();

        System.out.println("Number of Students Passed: " + count);
    }
}