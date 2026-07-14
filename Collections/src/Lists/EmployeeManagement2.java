package Lists;

public class EmployeeManagement2 {

    public static void main(String[] args) {

        EmployeeDataBase db = new EmployeeDataBase();

        Employee e1 = new Employee(101, "Haritha", "haritha@gmail.com", "Female", 50000);
        Employee e2 = new Employee(102, "Rahul", "rahul@gmail.com", "Male", 45000);
        Employee e3 = new Employee(103, "Priya", "priya@gmail.com", "Female", 55000);

        db.addEmployee(e1);
        db.addEmployee(e2);
        db.addEmployee(e3);

        System.out.println("Employee Details");
        db.displayEmployees();

        System.out.println();
        System.out.println(db.showPaySlip(102));

        db.deleteEmployee(102);

        System.out.println();
        System.out.println("After Deleting Employee 102");
        System.out.println();

        db.displayEmployees();
    }
}