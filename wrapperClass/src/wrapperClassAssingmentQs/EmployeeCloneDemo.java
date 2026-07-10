package wrapperClassAssingmentQs;

public class EmployeeCloneDemo {

    public static void main(String[] args) {

        try {

            Employee emp1 = new Employee(101, "Haritha", "IT", 50000);

            Employee emp2 = (Employee) emp1.clone();

            emp1.setEmpName("Priya");
            emp1.setDepartment("HR");
            emp1.setSalary(65000);

            System.out.println("Original Employee Details");
            emp1.displayEmployee();

            System.out.println("Cloned Employee Details");
            emp2.displayEmployee();

        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning is not supported.");
        }
    }
}