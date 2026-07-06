package day3;

import java.util.Scanner;

public class LastDigit {

    public static int getLastDigit(int num) {
        return Math.abs(num % 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.println(getLastDigit(num));

        sc.close();
    }
}
