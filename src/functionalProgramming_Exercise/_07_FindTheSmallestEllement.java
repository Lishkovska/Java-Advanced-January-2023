package functionalProgramming_Exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class _07_FindTheSmallestEllement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        Consumer<List<Integer>> printSmallestElementIndex = list -> {
            System.out.println(list.lastIndexOf(Collections.min(numbersList)));
        };

        printSmallestElementIndex.accept(numbersList);

    }
}
