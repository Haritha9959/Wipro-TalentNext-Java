package strings;

import java.util.Scanner;

public class Repeat {

    public static String Repeat (String str, int n) {

        String lastPart = str.substring(str.length() - n);
        String result = "";

        for (int i = 0; i < n; i++) {
            result += lastPart;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Output: " + Repeat(str, n));

        sc.close();
    }
}