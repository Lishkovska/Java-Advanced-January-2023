package iteratorsComparators.StackIteratorExercise_03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        Stack<Integer> stack = new Stack<>();

        while (!inputLine.equals("END")) {
            inputLine = inputLine.replace(",", "");
            String[] commandParts = inputLine.split("\\s+");
            String command = commandParts[0];
            switch (command) {
                case "Push":
                    for (int i = 1; i < commandParts.length; i++) {
                        stack.push(Integer.parseInt(commandParts[i]));
                    }
                    break;
                case "Pop":
                    try {
                        stack.pop();
                    } catch (IllegalArgumentException e) {
                        System.out.println("No elements");
                    }
                    break;
            }

            inputLine = scanner.nextLine();
        }

        stack.forEach(System.out::println);
        stack.forEach(System.out::println);

    }
}
