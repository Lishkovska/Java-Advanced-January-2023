package functionalProgramming_Lesson;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class _06_FindEvenOrOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int startNum = Integer.parseInt(input.split(" ")[0]);
        int endNum = Integer.parseInt(input.split(" ")[1]);
        String command = scanner.nextLine();

        Predicate<Integer> filterEvenOrOdd = command.equals("even") ? (n -> n % 2 == 0)
                : (n -> n % 2 != 0);

        IntStream.range(startNum, endNum + 1).filter(filterEvenOrOdd::test)
                .forEach(n -> System.out.print(n + " "));

    }
}
