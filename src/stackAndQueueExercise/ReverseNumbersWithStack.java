package stackAndQueueExercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumbersWithStack {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        ArrayDeque<Integer> numStack = new ArrayDeque<>();

        for (int nums : numbersArr){
            numStack.push(nums);
        }
        for (int numbers : numStack){
            System.out.print(numStack.pop() + " ");
        }

    }
}
