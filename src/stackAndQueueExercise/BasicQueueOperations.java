package stackAndQueueExercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] lineInputArr = scanner.nextLine().split(" ");
        int numToOffer = Integer.parseInt(lineInputArr[0]);
        int numToPoll = Integer.parseInt(lineInputArr[1]);
        int numToCheck = Integer.parseInt(lineInputArr[2]);

        int[] numsArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < numToOffer; i++) {
            queue.offer(numsArr[i]);
        }
        for (int i = 0; i < numToPoll; i++) {
            queue.poll();
        }

        if (queue.isEmpty()) {
            System.out.println("0");
        } else if (queue.contains(numToCheck)) {
            System.out.println("true");
        } else {
            int minNumber = Integer.MAX_VALUE;
            for (int current : queue) {
                if (current < minNumber) {
                    minNumber = current;
                }
            }
            System.out.println(minNumber);

        }
    }
}
