package iteratorsComparators.FroggyExercise_04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainD {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        Integer[] numbersArr = Arrays.stream(inputLine.split(", "))
                .map(Integer::parseInt)
                .toArray(Integer[]::new);
        Lake lake = new Lake(numbersArr);

        List<String> output = new ArrayList<>();

        for (Integer number : lake) {
            output.add(String.valueOf(number));
        }

        System.out.println(String.join(", ", output));
    }
}
