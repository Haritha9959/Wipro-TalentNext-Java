package tm06_01Project;

import java.util.Collections;
import java.util.List;

public class EmployeeBO {

    public void sortEmployees(List<Employee> employeeList) {
        Collections.sort(employeeList);
    }

    public void displayEmployees(List<Employee> employeeList) {

        System.out.printf("%-15s %-15s %-15s %-30s %-15s%n",
                "Firstname", "Lastname", "Mobile", "Email", "Address");

        for (Employee e : employeeList) {
            System.out.printf("%-15s %-15s %-15d %-30s %-15s%n",
                    e.getFirstName(),
                    e.getLastName(),
                    e.getMobileNumber(),
                    e.getEmail(),
                    e.getAddress());
        }
    }
}