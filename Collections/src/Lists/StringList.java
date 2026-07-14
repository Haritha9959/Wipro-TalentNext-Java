package Lists;

import java.util.ArrayList;
import java.util.Iterator;

public class StringList {

    public static void printAll(ArrayList<String> list) {

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Haritha");
        names.add("Rahul");
        names.add("Priya");
        names.add("Kiran");
        names.add("Anjali");

        System.out.println("Elements in the ArrayList:");

        printAll(names);
    }
}