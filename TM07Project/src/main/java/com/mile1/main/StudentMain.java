package com.mile1.main;

import com.mile1.bean.Student;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;

public class StudentMain {

    static Student data[] = new Student[4];

    public StudentMain() {

        data[0] = new Student("Sekar", new int[] {85, 75, 95});
        data[1] = new Student(null, new int[] {11, 22, 33});
        data[2] = null;
        data[3] = new Student("Manoj", null);

    }

    public static void main(String[] args) {

        new StudentMain();

        StudentReport report = new StudentReport();
        StudentService service = new StudentService();

        for (Student student : data) {

            try {

                if (report.validate(student).equals("VALID")) {

                    System.out.println(report.findGrades(student));

                }

            } catch (Exception e) {

                System.out.println(e);

            }

        }

        System.out.println(service.findNumberOfNullMarksArray(data));
        System.out.println(service.findNumberOfNullName(data));
        System.out.println(service.findNumberOfNullObjects(data));

    }
}