package com.wipro.task;

public class Demo2 {

    public boolean palindromeCheck(String str) {

        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        return str.equals(reverse);
    }
}