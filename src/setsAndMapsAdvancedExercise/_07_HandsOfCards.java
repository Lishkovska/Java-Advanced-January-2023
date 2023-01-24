package setsAndMapsAdvancedExercise;

import java.util.*;
import java.util.stream.Collectors;

import static java.lang.Character.isDigit;

public class _07_HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        LinkedHashMap<String, LinkedHashSet<String>> nameAndCardsMap = new LinkedHashMap<>();

        while (!input.equals("JOKER")){
          String name = input.split(":")[0];

          List<String> cards = Arrays.stream(input.split(":\\s+")[1].trim().split(", "))
                    .collect(Collectors.toList());

            nameAndCardsMap.putIfAbsent(name, new LinkedHashSet<>());
            nameAndCardsMap.get(name).addAll(cards);
            input = scanner.nextLine();
        }
        for (Map.Entry<String, LinkedHashSet<String>> entry : nameAndCardsMap.entrySet()) {
            System.out.printf("%s: ",entry.getKey());
            int totalSum = getSum(entry);
            System.out.print(totalSum);
            System.out.println();
        }
    }

    private static int getSum(Map.Entry<String, LinkedHashSet<String>> entry) {
        int sum = 0;
        for (String symbol : entry.getValue()) {
            String type = symbol.substring(symbol.length() - 1);
            String card = symbol.substring(0, symbol.length() - 1);
            
            int multiplier = getPower(type);

            if (isDigit(card.charAt(0))) {
                int cards = Integer.parseInt(card);
                sum += cards * multiplier;
            } else {
                switch (card) {
                    case "J":
                        sum += 11 * multiplier;
                        break;
                    case "Q":
                        sum += 12 * multiplier;
                        break;
                    case "K":
                        sum += 13 * multiplier;
                        break;
                    case "A":
                        sum += 14 * multiplier;
                        break;
                }
            }
        }
        return sum;
    }

    private static int getPower(String type) {
        int multiplier = 0;
        switch (type) {
            case "S":
                multiplier = 4;
                break;
            case "H":
                multiplier = 3;
                break;
            case "D":
                multiplier = 2;
                break;
            case "C":
                multiplier = 1;
                break;
        }
        return multiplier;
    }
}
