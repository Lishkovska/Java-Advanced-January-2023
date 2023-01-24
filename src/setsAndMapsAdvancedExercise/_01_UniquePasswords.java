package setsAndMapsAdvancedExercise;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class _01_UniquePasswords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashSet<String> uniqueSet = new LinkedHashSet<>();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            uniqueSet.add(input);
        }
        for (String s : uniqueSet) {
            System.out.println(s);
        }
    }
}
