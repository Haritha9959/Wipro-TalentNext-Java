package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ContactList {

    public static void main(String[] args) {

        HashMap<String, Integer> contacts = new HashMap<>();

        contacts.put("Haritha", 987654321);
        contacts.put("Rahul", 912345678);
        contacts.put("Priya", 998877665);
        contacts.put("Kiran", 987123456);
        contacts.put("Anjali", 901234567);

        String key = "Haritha";

        if (contacts.containsKey(key)) {
            System.out.println("Key \"" + key + "\" exists.");
        } else {
            System.out.println("Key \"" + key + "\" does not exist.");
        }

        Integer value = 998877665;

        if (contacts.containsValue(value)) {
            System.out.println("Value \"" + value + "\" exists.");
        } else {
            System.out.println("Value \"" + value + "\" does not exist.");
        }

        System.out.println();
        System.out.println("Contact List:");

        Iterator<Map.Entry<String, Integer>> iterator = contacts.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}