package setsAndMapsAdvancedLesson;

import java.util.*;
import java.util.stream.Collectors;

public class _03_VoinaNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> firstDeck = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        Set<Integer> secondDeck = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        int countSteps = 0;

        while (!firstDeck.isEmpty() && !secondDeck.isEmpty()){
            if (countSteps >= 50){
                break;
            }
            int fighterOne = firstDeck.iterator().next();
            firstDeck.remove(fighterOne);

            int fighterTwo = secondDeck.iterator().next();
            secondDeck.remove(fighterTwo);
            if (fighterOne > fighterTwo){
                firstDeck.add(fighterOne);
                firstDeck.add(fighterTwo);
            } else if (fighterOne < fighterTwo){
                secondDeck.add(fighterOne);
                secondDeck.add(fighterTwo);
            }
            countSteps++ ;
        }
        if (firstDeck.size() > secondDeck.size()){
            System.out.println("First player win!");
        } else if ( secondDeck.size() > firstDeck.size()){
            System.out.println("Second player win!");
        } else {
            System.out.println("Draw!");
        }
    }
}
