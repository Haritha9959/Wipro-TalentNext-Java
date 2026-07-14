package sets;

import java.util.HashSet;
import java.util.Iterator;

public class EmployeeDetials {

    public static void main(String[] args) {

        HashSet<String> employees = new HashSet<>();

        employees.add("Haritha");
        employees.add("Rahul");
        employees.add("Priya");
        employees.add("Kiran");
        employees.add("Anjali");

        System.out.println("Employee Names:");

        Iterator<String> iterator = employees.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}