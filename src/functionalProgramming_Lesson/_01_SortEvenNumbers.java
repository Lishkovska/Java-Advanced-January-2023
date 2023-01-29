package functionalProgramming_Lesson;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _01_SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(", "))
                .map(num -> Integer.parseInt(num)).collect(Collectors.toList());


        numbersList = numbersList.stream().filter(num -> num % 2 == 0 ).collect(Collectors.toList());

        printList(numbersList);
        System.out.println();

         numbersList.sort(Integer::compareTo);
        printList(numbersList);

    }

    private static void printList(List<Integer> numbersList) {
        for (int i = 0; i < numbersList.size(); i++) {
            System.out.print(numbersList.get(i));
            if(i < numbersList.size() - 1){
                System.out.print(", ");
            }
        }
    }
}
