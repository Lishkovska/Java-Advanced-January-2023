package stackAndQueueLesson;

import java.util.ArrayDeque;
import java.util.Scanner;

public class HotPotato07 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split(" ");
        int nToss = Integer.parseInt(scanner.nextLine());
        ArrayDeque<String> queue = new ArrayDeque<>();

        for (String child : inputArr){
            queue.offer(child);
        }

        while (queue.size() > 1){
            for (int i = 1; i < nToss; i++) {
                String currentChild = queue.poll();
                queue.offer(currentChild);
            }
            String removedChild = queue.poll();
            System.out.println("Removed " + removedChild);
        }
        System.out.println("Last is " + queue.poll());
      }
    }

