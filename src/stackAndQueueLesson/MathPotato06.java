package stackAndQueueLesson;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.*;

public class MathPotato06 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] childrenNames = scanner.nextLine().split(" ");
        int n = Integer.parseInt(scanner.nextLine());
        List<String> namesList = new ArrayList<>();
        PriorityQueue<String> children = new PriorityQueue<>();
        Collections.addAll(children, childrenNames);
        
        int steps = 1;
        while (children.size() > 1){
            for (int i = 1 ; i < n ; i++){
                String currentChild = children.poll();
                children.offer(currentChild);
            }
            if (isPrime(steps)){
                System.out.println("Prime " + children.peek());
            } else {
                String removedChild = children.poll();
                System.out.println("Removed " + removedChild);
            }
            steps++;
        }
    }

    private static boolean isPrime(int steps) {
        if (steps == 0){
            return true;
        }
        for (int i = 2 ; i < steps ; i++){
            if(steps % i == 0){
                return false;
            }
        }
        return true;
    }
}
