package project1;

public class Project1 {

    public static void main(String[] args) {

        EmployeeData emp = new EmployeeData();

        int id = Integer.parseInt(args[0]);

        int index = -1;

        // Search Employee
        for(int i=0; i<emp.empNo.length; i++) {

            if(emp.empNo[i] == id) {
                index = i;
                break;
            }

        }

        if(index == -1) {
            System.out.println("There is no employee with empid : " + id);
            return;
        }

        String designation = "";
        int da = 0;

        switch(emp.desigCode[index]) {

        case 'e':
            designation = "Engineer";
            da = 20000;
            break;

        case 'c':
            designation = "Consultant";
            da = 32000;
            break;

        case 'k':
            designation = "Clerk";
            da = 12000;
            break;

        case 'r':
            designation = "Receptionist";
            da = 15000;
            break;

        case 'm':
            designation = "Manager";
            da = 40000;
            break;

        }

        int salary = emp.basic[index] + emp.hra[index] + da - emp.it[index];

        System.out.println("Emp No\tEmp Name\tDepartment\tDesignation\tSalary");

        System.out.println(emp.empNo[index] + "\t"
                + emp.empName[index] + "\t\t"
                + emp.department[index] + "\t\t"
                + designation + "\t\t"
                + salary);

    }

}