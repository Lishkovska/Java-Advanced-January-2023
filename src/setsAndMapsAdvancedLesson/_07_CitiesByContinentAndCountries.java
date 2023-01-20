package setsAndMapsAdvancedLesson;

import java.util.*;

public class _07_CitiesByContinentAndCountries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Map<String, List<String>>> conCountryCityMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String continent = input.split(" ")[0];
            String country = input.split(" ")[1];
            String city = input.split(" ")[2];

            conCountryCityMap.putIfAbsent(continent, new LinkedHashMap<>());
            Map<String, List<String>> citiesByCountry = conCountryCityMap.get(continent);
            citiesByCountry.putIfAbsent(country, new ArrayList<>());
            citiesByCountry.get(country).add(city);
        }

        for (Map.Entry<String, Map<String, List<String>>> entry : conCountryCityMap.entrySet()) {
            System.out.println(entry.getKey() + ":");
            for (Map.Entry<String, List<String>> country : entry.getValue().entrySet()) {
                System.out.printf("  %s -> ", country.getKey());
                System.out.print(String.join(", ", country.getValue()));
                System.out.println();
            }
        }

    }
}

