package strings;

import java.util.Optional;

public class TestEmployee {

    public static void main(String[] args) {

        Employee emp = null;   
        try {
            Employee employee = Optional.ofNullable(emp)
                    .orElseThrow(() ->
                            new InvalidEmployeeException("Invalid Employee"));

            System.out.println("Employee ID: " + employee.getEmpId());
            System.out.println("Employee Name: " + employee.getEmpName());

        } catch (InvalidEmployeeException e) {
            System.out.println(e.getMessage());
        }
    }
}