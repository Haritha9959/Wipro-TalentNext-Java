package heritance;

public class TestEmployee {
    public static void main(String[] args) {

        Employee emp = new Employee(
                "Haritha",
                600000.0,
                2026,
                "NI123456"
        );

        System.out.println("Employee Details");
        System.out.println("----------------");
        System.out.println("Name : " + emp.getName());
        System.out.println("Annual Salary : " + emp.getAnnualSalary());
        System.out.println("Year Started : " + emp.getYearStarted());
        System.out.println("National Insurance Number : " + emp.getNationalInsuranceNumber());

        emp.setName("Priya");
        emp.setAnnualSalary(750000.0);
        emp.setYearStarted(2027);
        emp.setNationalInsuranceNumber("NI987654");

        System.out.println("\nUpdated Employee Details");
        System.out.println("------------------------");
        System.out.println("Name : " + emp.getName());
        System.out.println("Annual Salary : " + emp.getAnnualSalary());
        System.out.println("Year Started : " + emp.getYearStarted());
        System.out.println("National Insurance Number : " + emp.getNationalInsuranceNumber());
    }
}