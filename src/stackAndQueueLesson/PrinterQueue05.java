package stackAndQueueLesson;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue05 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ArrayDeque<String> printQueue = new ArrayDeque<>();

        while (!input.equals("print")){
            if (!input.equals("cancel")) {
                printQueue.offer(input);
            }else if (input.equals("cancel")){
                if (printQueue.isEmpty()){
                    System.out.println("Printer is on standby");
                } else {
                    System.out.printf("Canceled %s%n",printQueue.poll());
                }
            }
            input = scanner.nextLine();
        }
    }
}
