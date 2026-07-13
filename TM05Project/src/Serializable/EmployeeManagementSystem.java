package Serializable;

import java.io.*;
import java.util.*;

public class EmployeeManagementSystem {

    static final String FILE_NAME = "employee.dat";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("Main Menu");
            System.out.println("1. Add an Employee");
            System.out.println("2. Display All");
            System.out.println("3. Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Employee Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Employee Age: ");
                    int age = sc.nextInt();

                    System.out.print("Enter Employee Salary: ");
                    double salary = sc.nextDouble();

                    ArrayList<Employee> list = readEmployees();
                    list.add(new Employee(id, name, age, salary));
                    writeEmployees(list);

                    break;

                case 2:

                    ArrayList<Employee> employees = readEmployees();

                    System.out.println("----Report-----");

                    for (Employee e : employees) {
                        System.out.println(e);
                    }

                    System.out.println("----End of Report-----");

                    break;

                case 3:

                    System.out.println("Exiting the System");
                    sc.close();
                    System.exit(0);

                default:

                    System.out.println("Invalid Choice");
            }
        }
    }

    public static void writeEmployees(ArrayList<Employee> list) {

        try {

            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FILE_NAME));
            out.writeObject(list);
            out.close();

        } catch (Exception e) {

        }
    }

    public static ArrayList<Employee> readEmployees() {

        ArrayList<Employee> list = new ArrayList<>();

        try {

            ObjectInputStream in = new ObjectInputStream(new FileInputStream(FILE_NAME));
            list = (ArrayList<Employee>) in.readObject();
            in.close();

        } catch (Exception e) {

        }

        return list;
    }
}