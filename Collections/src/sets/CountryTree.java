package sets;

import java.util.Iterator;
import java.util.TreeSet;

public class CountryTree {

    private TreeSet<String> T1 = new TreeSet<>();

    public TreeSet<String> saveCountryNames(String countryName) {
        T1.add(countryName);
        return T1;
    }

    public String getCountry(String countryName) {

        Iterator<String> iterator = T1.iterator();

        while (iterator.hasNext()) {
            String country = iterator.next();

            if (country.equals(countryName)) {
                return country;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        CountryTree countrySet = new CountryTree();

        countrySet.saveCountryNames("India");
        countrySet.saveCountryNames("USA");
        countrySet.saveCountryNames("Japan");
        countrySet.saveCountryNames("Australia");

        System.out.println("Countries in TreeSet:");
        Iterator<String> iterator = countrySet.T1.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println();

        System.out.println("Search for India: " + countrySet.getCountry("India"));
        System.out.println("Search for Canada: " + countrySet.getCountry("Canada"));
    }
}