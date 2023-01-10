package stackAndQueueExercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MaximumElement03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> numbersStack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String[] commandArr = scanner.nextLine().split(" ");
            int action = Integer.parseInt(commandArr[0]);

            if (action == 1){
                int numberToPush = Integer.parseInt(commandArr[1]);
                numbersStack.push(numberToPush);
            } else if (action == 2){
                numbersStack.pop();
            } else if (action == 3){
                int maxNum = Integer.MIN_VALUE;

                if (!numbersStack.isEmpty()){
                    for (int currentNum : numbersStack){
                        if (currentNum > maxNum){
                            maxNum = currentNum;
                        }
                    }
                    System.out.println(maxNum);
                }
                }
            }
        }
    }

