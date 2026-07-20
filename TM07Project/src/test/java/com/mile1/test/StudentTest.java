package com.mile1.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;

public class StudentTest {

    StudentReport report = new StudentReport();
    StudentService service = new StudentService();

    // TC1 - Grade A
    @Test
    public void testGradeA() throws Exception {
        Student s = new Student("Haritha", new int[] {70, 75, 80});
        assertEquals("A", report.findGrades(s));
    }

    // TC2 - Grade D/F (according to your logic it is F)
    @Test
    public void testGradeF() throws Exception {
        Student s = new Student("Haritha", new int[] {20, 50, 60});
        assertEquals("F", report.findGrades(s));
    }

    // TC3 - Another F case
    @Test
    public void testGradeF2() throws Exception {
        Student s = new Student("Haritha", new int[] {10, 15, 20});
        assertEquals("F", report.findGrades(s));
    }

    // TC4 - Null Student Object
    @Test
    public void testNullStudentObject() {
        assertThrows(NullStudentObjectException.class, () -> {
            report.validate(null);
        });
    }

    // TC5 - Null Name
    @Test
    public void testNullName() {
        Student s = new Student(null, new int[] {50,60,70});

        assertThrows(NullNameException.class, () -> {
            report.validate(s);
        });
    }

    // TC6 - Null Marks Array
    @Test
    public void testNullMarksArray() {
        Student s = new Student("Haritha", null);

        assertThrows(NullMarksArrayException.class, () -> {
            report.validate(s);
        });
    }

    // TC7 - Count Null Names
    @Test
    public void testFindNumberOfNullName() {

        Student[] students = {
                new Student(null,new int[]{10,20,30}),
                new Student("A",new int[]{10,20,30}),
                new Student(null,new int[]{40,50,60})
        };

        assertEquals(2, service.findNumberOfNullName(students));
    }

    // TC8 - Count Null Objects
    @Test
    public void testFindNumberOfNullObjects() {

        Student[] students = {
                new Student("A",new int[]{10,20,30}),
                null,
                new Student("B",new int[]{40,50,60}),
                null
        };

        assertEquals(2, service.findNumberOfNullObjects(students));
    }

    // TC9 - Count Null Marks Array
    @Test
    public void testFindNumberOfNullMarksArray() {

        Student[] students = {
                new Student("A",null),
                new Student("B",new int[]{10,20,30}),
                new Student("C",null)
        };

        assertEquals(2, service.findNumberOfNullMarksArray(students));
    }
}