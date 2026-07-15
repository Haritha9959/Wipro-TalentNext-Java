package tm06_01Project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Employee> employeeList = new ArrayList<>();

        System.out.println("Enter the Number of Employees");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= n; i++) {

            System.out.println("Enter Employee " + i + " Details:");

            System.out.println("Enter the Firstname");
            String firstName = sc.nextLine();

            System.out.println("Enter the Lastname");
            String lastName = sc.nextLine();

            System.out.println("Enter the Mobile");
            long mobile = Long.parseLong(sc.nextLine());

            System.out.println("Enter the Email");
            String email = sc.nextLine();

            System.out.println("Enter the Address");
            String address = sc.nextLine();

            Employee emp = new Employee(firstName, lastName, mobile, email, address);

            employeeList.add(emp);
        }

        EmployeeBO bo = new EmployeeBO();

        bo.sortEmployees(employeeList);

        System.out.println("\nEmployee List:\n");

        bo.displayEmployees(employeeList);

        sc.close();
    }
}