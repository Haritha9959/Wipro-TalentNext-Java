package com.wipro.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.wipro.task.Employee;

public class TestEmployee {

    @Test
    public void testFindNameFound() {

        Employee emp = new Employee();

        ArrayList<String> employees = new ArrayList<>();

        employees.add("Haritha");
        employees.add("Rahul");
        employees.add("Anusha");
        employees.add("Ravi");

        String actual = emp.findName(employees, "Haritha");

        assertEquals("FOUND", actual);
    }

    @Test
    public void testFindNameNotFound() {

        Employee emp = new Employee();

        ArrayList<String> employees = new ArrayList<>();

        employees.add("Haritha");
        employees.add("Rahul");
        employees.add("Anusha");
        employees.add("Ravi");

        String actual = emp.findName(employees, "Kiran");

        assertEquals("NOT FOUND", actual);
    }
}