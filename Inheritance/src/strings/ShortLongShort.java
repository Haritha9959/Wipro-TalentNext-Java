package strings;

import java.util.Scanner;

public class ShortLongShort {

    public static String combineStrings(String a, String b) {

        if (a.length() < b.length()) {
            return a + b + a;
        } else {
            return b + a + b;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String a = sc.nextLine();

        System.out.print("Enter second string: ");
        String b = sc.nextLine();

        System.out.println("Output: " + combineStrings(a, b));

        sc.close();
    }
}