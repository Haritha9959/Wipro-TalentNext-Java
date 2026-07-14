package sets;

import java.util.Iterator;
import java.util.TreeSet;

public class Tree {

    public static void main(String[] args) {

        TreeSet<String> names = new TreeSet<>();

        names.add("Haritha");
        names.add("Rahul");
        names.add("Priya");
        names.add("Kiran");
        names.add("Anjali");

        System.out.println("Elements in Reverse Order:");
        Iterator<String> reverse = names.descendingIterator();

        while (reverse.hasNext()) {
            System.out.println(reverse.next());
        }

        System.out.println();

        System.out.println("Elements Using Iterator:");
        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println();

        String search = "Haritha";

        if (names.contains(search)) {
            System.out.println(search + " exists in the TreeSet.");
        } else {
            System.out.println(search + " does not exist in the TreeSet.");
        }
    }
}