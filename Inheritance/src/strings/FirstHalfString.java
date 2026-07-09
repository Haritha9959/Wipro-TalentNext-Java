package strings;

import java.util.Scanner;

public class FirstHalfString {

    public static String getFirstHalf(String str) {

        if (str.length() % 2 != 0) {
            return null;
        }

        return str.substring(0, str.length() / 2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.println(getFirstHalf(input));

        sc.close();
    }
}