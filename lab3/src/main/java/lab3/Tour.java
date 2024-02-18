package lab3;

import java.util.*;

public class Tour {

    public static void main(String[] args){

        HashMap<String, String> countries_cities = new HashMap<>();
        countries_cities.put("Polska", "Warszwa");
        countries_cities.put("Grecja", "Ateny");
        countries_cities.put("Szwecja", "Sztokholm");
        countries_cities.put("Włochy", "Rzym");
        countries_cities.put("Anglia", "Londyn");

        List<String> cities = new ArrayList<String>();
        cities.add("Paryż");
        cities.add("Lizbona");
        cities.add("Londyn");
        cities.add("Wrocław");

        Set<String> uniqueCities = new HashSet<>();
        uniqueCities.add("Paryż");
        uniqueCities.add("Lizbona");
        uniqueCities.add("Tokyo");
        uniqueCities.add("Warszawa");
        uniqueCities.add("Ateny");
        uniqueCities.add("Wrocław");


        print_countries_cities(countries_cities);
        System.out.println("\n");
        print_cities(cities);
        System.out.println("\n");
        print_unique_cities(uniqueCities);

    }

    public static void print_countries_cities(HashMap<String, String> countries_cities){
        for (String country: countries_cities.keySet()) {
            System.out.println(country + " " + countries_cities.get(country));
        }
        System.out.println("czy w kolekcji jest Szwecja: " + countries_cities.containsKey("Szwecja"));
        System.out.println("kolekcja ma: " + countries_cities.size() + " elementów");
    }

    public static void print_cities(List<String> cities){
        for (String city:cities) {
            System.out.println(city);
        }
        System.out.println("Czy w kolekcji jest Paryż: " + cities.contains("Paryż"));
        System.out.println("kolekcja ma: " + cities.size() + " elementów");
    }

    public static void print_unique_cities(Set<String> uniqueCities){
        for (String unique_cities:uniqueCities) {
            System.out.println(unique_cities);
        }
        System.out.println("Czy w kolekcji jest Rzym: " + uniqueCities.contains("Rzym"));
        System.out.println("kolekcja ma: " + uniqueCities.size() + " elementów");
    }

}
