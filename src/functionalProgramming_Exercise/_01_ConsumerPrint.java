package functionalProgramming_Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import static java.lang.System.out;

public class _01_ConsumerPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Function<приема, връща> apply.
        //Consumer <приема> Void -> accept.
        //Predicate<приема> връща true/false -> test.

        Consumer<String> print = getPrint();

        for (String name : scanner.nextLine().split("\\s+")) {
            print.accept(name);
        }
    }

    private static Consumer<String> getPrint() {
        return System.out::println;
    }

}

