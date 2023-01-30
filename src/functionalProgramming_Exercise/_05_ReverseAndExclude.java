package functionalProgramming_Exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _05_ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split(" "))
                .map(num -> Integer.parseInt(num)).collect(Collectors.toList());

        int n = Integer.parseInt(scanner.nextLine());
        Collections.reverse(list);
        list.removeIf(e -> e % n == 0);
        list.forEach(e -> System.out.print(e + " "));

    }
}
