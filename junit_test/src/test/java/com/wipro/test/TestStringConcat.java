package com.wipro.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.wipro.task.DailyTasks;

public class TestStringConcat {

    @Test
    public void testDoStringConcat() {

        DailyTasks task = new DailyTasks();

        String actual = task.doStringConcat("Hello", "World");

        String expected = "Hello World";

        assertEquals(expected, actual);
    }
}