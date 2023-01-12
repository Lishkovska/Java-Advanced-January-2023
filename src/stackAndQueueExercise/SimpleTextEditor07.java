package stackAndQueueExercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditor07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        ArrayDeque<String> queue = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String[] currentCommand = scanner.nextLine().split(" ");
            String action = currentCommand[0];

            switch (action){
                case "1" :
                    String textToAppend = currentCommand[1];
                    queue.offer(textToAppend);
                    break;
                case "2":
                    int count = Integer.parseInt(currentCommand[1]);


                    }
                    break;

        }


    }
}
