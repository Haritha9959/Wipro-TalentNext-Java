package functionalInterface;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PalindromeFilter {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();

        words.add("madam");
        words.add("java");
        words.add("level");
        words.add("apple");
        words.add("radar");
        words.add("banana");
        words.add("malayalam");
        words.add("orange");
        words.add("noon");
        words.add("grapes");

        Predicate<String> palindrome = word -> {
            String reverse = new StringBuilder(word).reverse().toString();
            return word.equalsIgnoreCase(reverse);
        };

        System.out.println("Palindrome Words:");

        words.stream()
             .filter(palindrome)
             .forEach(System.out::println);
    }
}