package setsAndMapsAdvancedLesson;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _06_ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        TreeMap<String, Map<String, Double>> shopProductPriceMap = new TreeMap<>();

        while (!input.equals("Revision")) {
            String shop = input.split(", ")[0];
            String product = input.split(", ")[1];
            double price = Double.parseDouble(input.split(", ")[2]);

            shopProductPriceMap.putIfAbsent(shop, new LinkedHashMap<>());
            shopProductPriceMap.get(shop).put(product, price);

            input = scanner.nextLine();
        }

        for (Map.Entry<String, Map<String, Double>> entry : shopProductPriceMap.entrySet()) {
            System.out.println(entry.getKey() + "->");
            for (Map.Entry<String, Double> goods : entry.getValue().entrySet()) {
                String output = String.format("Product: %s, Price: %.1f", goods.getKey(), goods.getValue());
                System.out.println(output);
            }
        }

       }
    }

