package projects.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountryMap {
    public static void main(String[] args) {
        Map<String, String> CountryMap = new HashMap<>();
        CountryMap.put("Bharat", "New Delhi");
        CountryMap.put("Japan", "Tokyo");
        CountryMap.put("China", "Beijing");
        CountryMap.put("Pakishtan", "Islamabad");
        CountryMap.put("Srilanka", "Columbo");
        CountryMap.put("Bangladesh", "Dhaka");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the country name :- ");
        String country = input.next();

        if (CountryMap.containsKey(country)) {
            System.out.printf("Capital of %s is %s", country, CountryMap.get(country));
        } else {
            System.out.println("Sorry we don't know the capital");
        }

    }
}
