package day3;

import java.util.Scanner;

public class LastSecondDiggit {

    public static int getSecondLastDigit(int num) {
        num = Math.abs(num);

        if (num < 10) {
            return -1;
        }

        return (num / 10) % 10;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.println(getSecondLastDigit(num));

        sc.close();
    }
}