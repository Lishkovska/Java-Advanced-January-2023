package functionalProgramming_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class _04_AppliedAritmetics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split(" "))
                .map(num -> Integer.parseInt(num)).collect(Collectors.toList());

        String command = scanner.nextLine();

        //"add" -> adds 1; "multiply" -> multiplies by 2; "subtract" -> subtracts 1; "print" -> prints
        // all numbers on a new line. The input will end with an "end" command,
        // after which the result must be printed.
        while (!command.equals("end")){
            for (Integer currentNum : list) {
                switch (command){
                    case "add" :
                       // currentNum = currentNum + 1;
                        Function<Integer, Integer> add = n -> n + 1;
                        add.apply(currentNum);
                        break;
                    case "multiply" :
                       // currentNum = currentNum * 2;
                        Function<Integer, Integer> multiply = n -> n * 2;
                        multiply.apply(currentNum);
                        break;
                    case "subtract" :
                       // currentNum = currentNum - 1 ;
                        Function<Integer, Integer> subtract = n -> n - 1;
                        subtract.apply(currentNum);
                        break;
                    case "print" :
                        System.out.println(currentNum + " ");
                        break;
                }
            }
            command = scanner.nextLine();
        }
        for (Integer integer : list) {
        System.out.println(integer + " ");
        }
    }
}
