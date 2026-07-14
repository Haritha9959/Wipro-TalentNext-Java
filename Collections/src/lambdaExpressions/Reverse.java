package lambdaExpressions;

import java.util.ArrayList;
import java.util.Collections;

public class Reverse {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("Apple");
        al.add("Banana");
        al.add("Cherry");
        al.add("Orange");
        al.add("Mango");
        al.add("Grapes");
        al.add("Papaya");
        al.add("Guava");
        al.add("Pineapple");
        al.add("Watermelon");

        Collections.reverse(al);

        System.out.println("Strings in Reverse Order:");

        al.forEach(word -> System.out.println(word));
    }
}