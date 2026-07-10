package wrapperClassAssingmentQs;

import java.util.Scanner;

public class BinaryRepresentation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer (1 to 255): ");
        int number = sc.nextInt();

        if (number >= 1 && number <= 255) {

            // Convert to binary using Integer Wrapper Class
            String binary = Integer.toBinaryString(number);

            // Pad with leading zeros to make it 8 bits
            String result = String.format("%8s", binary).replace(' ', '0');

            System.out.println(result);

        } else {
            System.out.println("Invalid Input");
        }

        sc.close();
    }
}