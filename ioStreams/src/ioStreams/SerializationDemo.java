package ioStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class SerializationDemo {

    public static void main(String[] args) {
        try {
            Employee emp = new Employee(
                    "Haritha",
                    new Date(104, 4, 15),
                    "Information Technology",
                    "Software Engineer",
                    45000.0);

            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data"));
            oos.writeObject(emp);
            oos.close();

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data"));
            Employee e = (Employee) ois.readObject();
            ois.close();

            System.out.println("Name: " + e.getName());
            System.out.println("Date of Birth: " + e.getDateOfBirth());
            System.out.println("Department: " + e.getDepartment());
            System.out.println("Designation: " + e.getDesignation());
            System.out.println("Salary: " + e.getSalary());

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}