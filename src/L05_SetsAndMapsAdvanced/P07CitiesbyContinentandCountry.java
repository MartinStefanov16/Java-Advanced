package L05_SetsAndMapsAdvanced;

import java.util.*;

import static java.lang.System.in;

public class P07CitiesbyContinentandCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        // solution
        //https://github.com/slavoff/java-advanced/blob/main/7.%20Sets%20and%20Maps%20Advanced/_7_CitiesByContinentAndCountry.txt

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Map<String, List<String>>> earth = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String continent = input[0];
            String country = input[1];
            String city = input[2];

            earth.putIfAbsent(continent, new LinkedHashMap<>());
            Map<String, List<String>> countriesAndCities = earth.get(continent);

            countriesAndCities.putIfAbsent(country, new ArrayList<>());
            List<String> cities = countriesAndCities.get(country);
            cities.add(city);

        }

        for (Map.Entry<String, Map<String, List<String>>> continent : earth.entrySet()) {
            System.out.printf("%s:\n", continent.getKey());
            for (Map.Entry<String, List<String>> entry : continent.getValue().entrySet()) {
                System.out.printf("%s -> ", entry.getKey());
                System.out.println(entry.getValue().toString()
                        .replace("[", "")
                        .replace("]", "")
                        .trim()
                        //.replaceAll(",","")
                        .replaceAll("\\s+"," "));
            }


        }


    }
}
