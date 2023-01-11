package stackAndQueueLesson;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MathPotato06 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] childrenNames = scanner.nextLine().split(" ");
        int n = Integer.parseInt(scanner.nextLine());
        ArrayDeque<String> childrenQueue = new ArrayDeque<>();

        for (String child : childrenNames){
            childrenQueue.offer(child);
        }

        while (childrenQueue.size() > 1){
            for (int i = 0 ; i <= n ; i++){
                String currentChild = childrenQueue.poll();
                childrenQueue.offer(currentChild);
            }
            System.out.println("Removed " + childrenQueue.poll());
            System.out.println("Prime is " + childrenQueue.poll());
        }
    }
}
