package setsAndMapsAdvancedExercise;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _04_CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String lineInput = scanner.nextLine();
        TreeMap<Character, Integer> symbolsMap = new TreeMap<>();

        for (int i = 0; i < lineInput.length(); i++) {
            char currentSymbol = lineInput.charAt(i);
            if(!symbolsMap.containsKey(currentSymbol)){
                symbolsMap.put(currentSymbol, 1);
            } else {
                symbolsMap.put(currentSymbol, symbolsMap.get(currentSymbol) + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : symbolsMap.entrySet()) {
            System.out.printf("%c: %d time/s%n",entry.getKey(), entry.getValue());
        }
    }
}
