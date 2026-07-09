package strings;

import java.util.Scanner;

public class RemoveX {

    public static String removeX(String str) {

        if (str.length() == 0) {
            return str;
        }

        if (str.startsWith("x")) {
            str = str.substring(1);
        }

        if (str.endsWith("x")) {
            str = str.substring(0, str.length() - 1);
        }

        return str;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.println("Output: " + removeX(input));

        sc.close();
    }
}