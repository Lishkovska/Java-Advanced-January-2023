package setsAndMapsAdvancedLesson;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _09_LargestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).sorted(Comparator.reverseOrder()).limit(3)
                .collect(Collectors.toList());

        for (Integer integer : numbersList) {
            System.out.print(integer + " ");
        }

    }
}
