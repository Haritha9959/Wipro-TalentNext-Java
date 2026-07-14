package Lists;

import java.util.Iterator;
import java.util.LinkedList;

public class EmployeeData {

    private LinkedList<Employee> list = new LinkedList<>();

    public boolean addEmployee(Employee e) {
        return list.add(e);
    }

    public boolean deleteEmployee(int empId) {

        Iterator<Employee> iterator = list.iterator();

        while (iterator.hasNext()) {
            Employee e = iterator.next();

            if (e.getEmpId() == empId) {
                iterator.remove();
                return true;
            }
        }

        return false;
    }

    public String showPaySlip(int empId) {

        Iterator<Employee> iterator = list.iterator();

        while (iterator.hasNext()) {
            Employee e = iterator.next();

            if (e.getEmpId() == empId) {
                return "Pay Slip\nEmployee ID : " + e.getEmpId()
                        + "\nEmployee Name : " + e.getEmpName()
                        + "\nSalary : " + e.getSalary();
            }
        }

        return "Employee Not Found";
    }

    public void displayEmployees() {

        Iterator<Employee> iterator = list.iterator();

        while (iterator.hasNext()) {
            Employee e = iterator.next();
            e.getEmployeeDetails();
            System.out.println();
        }
    }
}