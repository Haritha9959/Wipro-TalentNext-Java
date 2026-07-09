package project2;

import java.util.Scanner;

public class VideoLauncher {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        VideoStore store = new VideoStore();

        int choice;

        do {

            System.out.println("\n===== VIDEO RENTAL INVENTORY =====");
            System.out.println("1. Add Video");
            System.out.println("2. Checkout Video");
            System.out.println("3. Return Video");
            System.out.println("4. Receive Rating");
            System.out.println("5. List Inventory");
            System.out.println("6. Exit");

            System.out.print("Enter Choice : ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Video Name : ");
                    store.addVideo(sc.nextLine());
                    break;

                case 2:

                    System.out.print("Enter Video Name : ");
                    store.doCheckout(sc.nextLine());
                    break;

                case 3:

                    System.out.print("Enter Video Name : ");
                    store.doReturn(sc.nextLine());
                    break;

                case 4:

                    System.out.print("Enter Video Name : ");
                    String name = sc.nextLine();

                    System.out.print("Enter Rating : ");
                    int rating = sc.nextInt();

                    store.receiveRating(name, rating);
                    break;

                case 5:

                    store.listInventory();
                    break;

                case 6:

                    System.out.println("Thank You!");
                    break;

                default:

                    System.out.println("Invalid Choice.");

            }

        } while (choice != 6);

        sc.close();

    }

}