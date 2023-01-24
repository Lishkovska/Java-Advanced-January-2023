package setsAndMapsAdvancedExercise;

import java.util.Scanner;
import java.util.TreeSet;

public class _03_PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        TreeSet<String> chemicalSet = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            String[] lineInput = scanner.nextLine().split(" ");
            for (int j = 0; j < lineInput.length; j++) {
                chemicalSet.add(lineInput[j]);
            }
        }

        for (String element : chemicalSet) {
            System.out.print(element + " ");
        }
    }
}
