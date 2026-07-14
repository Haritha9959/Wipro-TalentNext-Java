package dateTimeAPI;

import java.time.LocalDate;

public class LeapYearCheck {

    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now();

        int year = currentDate.getYear();

        if (currentDate.isLeapYear()) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is Not a Leap Year.");
        }
    }
}