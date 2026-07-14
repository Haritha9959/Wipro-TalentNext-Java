package Lists;

import java.util.ArrayList;

public class NumberList {

    public static void main(String[] args) {

        ArrayList<Number> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(25.5);
        numbers.add(35.75f);
        numbers.add(100L);
        numbers.add((short) 15);
        numbers.add((byte) 5);

        System.out.println("Numbers in the ArrayList:");

        for (Number number : numbers) {
            System.out.println(number);
        }
    }
}