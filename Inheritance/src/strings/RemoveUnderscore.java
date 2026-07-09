package strings;

import java.util.Scanner;

public class RemoveUnderscore {

    public static String removeChars(String str) {

        int index = str.indexOf('_');

        if (index == -1) {
            return str;
        }

        String left = "";
        String right = "";

        if (index > 1) {
            left = str.substring(0, index - 1);
        }

        if (index < str.length() - 2) {
            right = str.substring(index + 2);
        }

        return left + right;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.println("Output: " + removeChars(input));

        sc.close();
    }
}