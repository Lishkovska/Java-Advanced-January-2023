package functionalProgramming_Lesson;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _02_SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(", "))
                .map(num -> Integer.parseInt(num)).collect(Collectors.toList());

        int sum = numbersList.stream().mapToInt(e -> e).sum();

        System.out.printf("Count = %d%n",numbersList.size());
        System.out.printf("Sum = %d", sum);

    }
}
