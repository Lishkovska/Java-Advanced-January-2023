package functionalProgramming_Exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _03_CustomMinFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Function<приема, връща> apply.
        //Consumer <приема> Void -> accept.
        //Predicate<приема> връща true/false -> test.
        List<Integer> list = Arrays.stream(scanner.nextLine().split(" "))
                .map(num -> Integer.parseInt(num)).collect(Collectors.toList());

        System.out.println(Collections.min(list));

    }
}
