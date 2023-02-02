package functionalProgramming_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class _09_ListOfPredicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        BiFunction<Integer, List<Integer>, Boolean> isDivisibleTo = ((num, list) -> {
            for (int currentNum : list){
                if(num % currentNum != 0){
                    return false;
                }
            }
            return true;
        } );

        for (int i = 1; i <=n ; i++) {
            if (isDivisibleTo.apply(i, numbersList)) {
                System.out.print(i + " ");
            }
        }

    }
}
