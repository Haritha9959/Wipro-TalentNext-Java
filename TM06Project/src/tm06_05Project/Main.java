package tm06_05Project;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Box> boxSet = new LinkedHashSet<>();

        System.out.println("Enter the number of boxes:");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("Enter Box " + i + " Details:");

            System.out.println("Enter Length:");
            double length = sc.nextDouble();

            System.out.println("Enter Width:");
            double width = sc.nextDouble();

            System.out.println("Enter Height:");
            double height = sc.nextDouble();

            Box box = new Box(length, width, height);

            if (boxSet.add(box)) {
                System.out.println("Box Added Successfully.");
            } else {
                System.out.println("Box with same volume already exists.");
            }
        }

        System.out.println("\nUnique Boxes:");

        for (Box box : boxSet) {
            System.out.println(box);
        }

        sc.close();
    }
}