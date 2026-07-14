package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMap1 {

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();

        map.put("India", "Delhi");
        map.put("Japan", "Tokyo");
        map.put("USA", "Washington D.C.");
        map.put("Australia", "Canberra");

        String key = "India";

        if (map.containsKey(key)) {
            System.out.println("Key \"" + key + "\" exists.");
        } else {
            System.out.println("Key \"" + key + "\" does not exist.");
        }

        String value = "Tokyo";

        if (map.containsValue(value)) {
            System.out.println("Value \"" + value + "\" exists.");
        } else {
            System.out.println("Value \"" + value + "\" does not exist.");
        }

        System.out.println();
        System.out.println("HashMap Elements:");

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}