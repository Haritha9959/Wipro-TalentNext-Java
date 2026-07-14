package Map;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class MapClass {

    private TreeMap<String, String> M1 = new TreeMap<>();

    public TreeMap<String, String> saveCountryCapital(String countryName, String capital) {
        M1.put(countryName, capital);
        return M1;
    }

    public String getCapital(String countryName) {
        return M1.get(countryName);
    }

    public String getCountry(String capitalName) {

        for (Map.Entry<String, String> entry : M1.entrySet()) {
            if (entry.getValue().equals(capitalName)) {
                return entry.getKey();
            }
        }

        return null;
    }

    public TreeMap<String, String> swapKeyValue() {

        TreeMap<String, String> M2 = new TreeMap<>();

        for (Map.Entry<String, String> entry : M1.entrySet()) {
            M2.put(entry.getValue(), entry.getKey());
        }

        return M2;
    }

    public ArrayList<String> getCountryList() {

        ArrayList<String> list = new ArrayList<>();

        for (String country : M1.keySet()) {
            list.add(country);
        }

        return list;
    }

    public TreeMap<String, String> getMap() {
        return M1;
    }

    public static void main(String[] args) {

        MapClass obj = new MapClass();

        obj.saveCountryCapital("India", "Delhi");
        obj.saveCountryCapital("Japan", "Tokyo");
        obj.saveCountryCapital("USA", "Washington D.C.");
        obj.saveCountryCapital("Australia", "Canberra");

        System.out.println("Map M1");
        System.out.println(obj.getMap());

        System.out.println();

        System.out.println("Capital of India: " + obj.getCapital("India"));
        System.out.println("Country of Tokyo: " + obj.getCountry("Tokyo"));

        System.out.println();

        System.out.println("Map M2");
        System.out.println(obj.swapKeyValue());

        System.out.println();

        System.out.println("Country List");
        System.out.println(obj.getCountryList());
    }
}