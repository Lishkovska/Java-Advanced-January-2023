package functionalProgramming_Exercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class _06_PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        String[] namesArr = scanner.nextLine().split(" ");

        Predicate<String> checkLength = name -> name.length() <= length;
        Arrays.stream(namesArr).filter(checkLength).forEach(System.out::println);

    }
}



