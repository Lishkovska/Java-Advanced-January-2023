package functionalProgramming_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class _04_AppliedAritmetics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" "))
                .map(num -> Integer.parseInt(num)).collect(Collectors.toList());

        String command = scanner.nextLine();

        //"add" -> adds 1; "multiply" -> multiplies by 2; "subtract" -> subtracts 1; "print" -> prints
        // all numbers on a new line. The input will end with an "end" command,
        // after which the result must be printed.
        Function<List<Integer>, List<Integer>> add = list -> list.stream().
                map(num -> num += 1).collect(Collectors.toList());

        Function<List<Integer>, List<Integer>> multiply = list -> list.stream().
                map(num -> num *= 2).collect(Collectors.toList());

        Function<List<Integer>, List<Integer>> subtract = list -> list.stream().
                map(num -> num -= 1).collect(Collectors.toList());

        Consumer<List<Integer>> printCommand = list ->
                list.forEach(number -> System.out.print(number + " "));

        while (!command.equals("end")) {
            switch (command) {
                case "add":
                   numList = add.apply(numList);
                    break;
                case "multiply":
                   numList = multiply.apply(numList);
                    break;
                case "subtract":
                    numList = subtract.apply(numList);
                    break;
                case "print":
                    printCommand.accept(numList);
                    System.out.println();
                    break;
            }
            command = scanner.nextLine();
        }

    }
}

