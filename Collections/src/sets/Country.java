package sets;

import java.util.HashSet;
import java.util.Iterator;

public class Country {

    private HashSet<String> H1 = new HashSet<>();

    public HashSet<String> saveCountryNames(String countryName) {
        H1.add(countryName);
        return H1;
    }

    public String getCountry(String countryName) {

        Iterator<String> iterator = H1.iterator();

        while (iterator.hasNext()) {
            String country = iterator.next();

            if (country.equals(countryName)) {
                return country;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        Country countrySet = new Country();

        countrySet.saveCountryNames("India");
        countrySet.saveCountryNames("USA");
        countrySet.saveCountryNames("Japan");
        countrySet.saveCountryNames("Australia");

        System.out.println("Search for India: " + countrySet.getCountry("India"));
        System.out.println("Search for Canada: " + countrySet.getCountry("Canada"));
    }
}