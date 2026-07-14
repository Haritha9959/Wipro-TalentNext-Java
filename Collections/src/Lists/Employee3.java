package Lists;

public class Employee3 {

    private int empId;
    private String empName;
    private String email;
    private String gender;
    private float salary;

    public Employee3() {
    }

    public Employee3(int empId, String empName, String email, String gender, float salary) {
        this.empId = empId;
        this.empName = empName;
        this.email = email;
        this.gender = gender;
        this.salary = salary;
    }

    public void getEmployeeDetails() {
        System.out.println("Employee ID : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Email : " + email);
        System.out.println("Gender : " + gender);
        System.out.println("Salary : " + salary);
        System.out.println();
    }
}