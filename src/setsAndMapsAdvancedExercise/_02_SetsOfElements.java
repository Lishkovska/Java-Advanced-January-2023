package setsAndMapsAdvancedExercise;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class _02_SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       String[] length = scanner.nextLine().split(" ");
       int firstSetLength = Integer.parseInt(length[0]);
       int secondSetLength = Integer.parseInt(length[1]);

        LinkedHashSet<Integer> firstSet = new LinkedHashSet<>();
        LinkedHashSet<Integer> secondSet = new LinkedHashSet<>();

        for (int i = 0; i < firstSetLength; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            firstSet.add(currentNum);
        }
        for (int i = 0; i < secondSetLength; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            secondSet.add(currentNum);
        }

        LinkedHashSet<Integer> newSet;
        firstSet.retainAll(secondSet);

        newSet = firstSet;
        for (Integer number : newSet) {
           System.out.print(number + " ");
        }

    }
}
