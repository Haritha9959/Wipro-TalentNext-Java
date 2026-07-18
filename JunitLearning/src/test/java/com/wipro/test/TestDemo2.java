package com.wipro.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.wipro.task.Demo2;

public class TestDemo2 {

    @Test
    public void testPalindromeTrue() {

        Demo2 demo = new Demo2();

        assertTrue(demo.palindromeCheck("madam"));
    }

    @Test
    public void testPalindromeFalse() {

        Demo2 demo = new Demo2();

        assertFalse(demo.palindromeCheck("hello"));
    }
}