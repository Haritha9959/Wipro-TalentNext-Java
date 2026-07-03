package flowControlStatements;
import java.util.Scanner;
public class lastDigits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first non-negative integer: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second non-negative integer: ");
        int num2 = sc.nextInt();

        if ((num1 % 10) == (num2 % 10)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        sc.close();
    }
}