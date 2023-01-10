package stackAndQueueExercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class BasicStackOperations02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputArr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        int numToPush = inputArr[0];
        int numToPop = inputArr[1];
        int numToCheck = inputArr[2];

        int[] numsArr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        ArrayDeque<Integer> numStack = new ArrayDeque<>();

        for (int i = 0; i < numToPush; i++) {
            numStack.push(numsArr[i]);
        }
        for (int i = 0; i < numToPop; i++) {
            numStack.pop();
        }
        if (numStack.isEmpty()){
            System.out.println("0");
        } else {
           if (numStack.contains(numToCheck)){
               System.out.println("true");
            } else {
               int smallestNumber = Integer.MAX_VALUE;
               for (int current : numStack){
                   if (current < smallestNumber){
                       smallestNumber = current;
                   }
               }
               System.out.println(smallestNumber);
           }
        }
    }
}
