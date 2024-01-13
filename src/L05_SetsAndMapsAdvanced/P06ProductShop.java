package L05_SetsAndMapsAdvanced;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import static java.lang.System.in;

public class P06ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String input = scanner.nextLine();

        Map<String, Map<String, Double>> shops = new TreeMap<>();

        while (!input.equals("Revision")){
            String shopBrand = input.split(", ")[0];
            String product = input.split(", ")[1];
            double price = Double.parseDouble(input.split(", ")[2]);

            shops.putIfAbsent(shopBrand, new LinkedHashMap<>());
            Map<String, Double> foodAndPrice = shops.get(shopBrand);
            foodAndPrice.put(product, price);

            System.out.println();



            input = scanner.nextLine();
        }

        for (Map.Entry<String, Map<String, Double>> shop : shops.entrySet()) {
            System.out.println(shop.getKey() + "->");
            for (Map.Entry<String, Double> entry : shop.getValue().entrySet()) {
                System.out.printf("Product: %s, Price: %.1f\n", entry.getKey(), entry.getValue());

            }

        }
    }
}
