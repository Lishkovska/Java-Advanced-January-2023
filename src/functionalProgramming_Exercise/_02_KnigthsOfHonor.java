package functionalProgramming_Exercise;

import java.util.Scanner;
import java.util.function.Consumer;


public class _02_KnigthsOfHonor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Function<приема, връща> apply.
        //Consumer <приема> Void -> accept.
        //Predicate<приема> връща true/false -> test.

        Consumer<String> printSir = name -> System.out.println("Sir " + name);
        for (String s : scanner.nextLine().split(" ")) {
            printSir.accept(s);
        }
    }
}