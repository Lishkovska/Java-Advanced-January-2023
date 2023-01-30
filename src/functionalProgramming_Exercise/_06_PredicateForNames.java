package functionalProgramming_Exercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class _06_PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        String[] namesArr = scanner.nextLine().split(" ");

        Predicate<String> printResult = getFilterByLength(namesArr, length);
        
    }

    private static Predicate<String> getFilterByLength(String[] names, int length) {
        for (int i = 0; i < names.length; i++) {
            String currentName = names[i];
            if (currentName.length() <= length) {
                System.out.println(currentName + " ");
            }
        }
        return null ;
    }
}


