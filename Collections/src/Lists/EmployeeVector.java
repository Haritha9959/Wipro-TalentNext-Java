package Lists;

import java.util.Enumeration;
import java.util.Vector;

public class EmployeeVector {

    public static void main(String[] args) {

        Vector<Employee> employees = new Vector<>();

        employees.add(new Employee(101, "Haritha", "haritha@gmail.com", "Female", 50000));
        employees.add(new Employee(102, "Rahul", "rahul@gmail.com", "Male", 45000));
        employees.add(new Employee(103, "Priya", "priya@gmail.com", "Female", 55000));

        Enumeration<Employee> enumeration = employees.elements();

        while (enumeration.hasMoreElements()) {
            Employee employee = enumeration.nextElement();
            employee.getEmployeeDetails();
        }
    }
}