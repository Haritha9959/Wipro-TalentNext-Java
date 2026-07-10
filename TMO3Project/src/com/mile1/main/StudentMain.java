package com.mile1.main;

import com.mile1.bean.Student;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;

public class StudentMain {
    static Student data[] = new Student[4];

    public StudentMain() {
        for (int i = 0; i < data.length; i++) {
            data[i] = new Student();
        }
        data[0] = new Student("Sekar", new int[] {85, 75, 95});
        data[1] = new Student(null, new int[] {11, 22, 33});
        data[2] = null;
        data[3] = new Student("Manoj", null);
    }

    public static void main(String[] args) {
        new StudentMain();
        StudentReport studentReport = new StudentReport();
        StudentService studentService = new StudentService();

        for (Student student : data) {
            try {
                String validationResult = studentReport.validate(student);
                if ("VALID".equals(validationResult)) {
                    String grade = studentReport.findGrades(student);
                    System.out.println(grade);
                }
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }

        System.out.println(studentService.findNumberOfNullMarksArray(data));
        System.out.println(studentService.findNumberOfNullName(data));
        System.out.println(studentService.findNumberOfNullObjects(data));
    }
}