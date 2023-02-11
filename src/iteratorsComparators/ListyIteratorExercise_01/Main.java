package iteratorsComparators.ListyIteratorExercise_01;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();
        ListyIterator listyIterator = null;

        while (!inputLine.equals("END")) {

            String[] commandsPart = inputLine.split("\\s+");
            String command = commandsPart[0];

            switch (command) {
                case "Create":
                    if (commandsPart.length > 1) {
                        String[] elementArray = Arrays.copyOfRange(commandsPart, 1, commandsPart.length);
                        listyIterator = new ListyIterator(elementArray);
                    }else {
                        listyIterator = new ListyIterator();
                    }
                    break;
                case "Move":
                    System.out.println(listyIterator.move());
                    break;
                case "Print":
                    try {
                        listyIterator.print();
                    } catch (IllegalStateException e) {
                        System.out.println("Invalid Operation!");
                    }
                    break;
                case "HasNext":
                    System.out.println(listyIterator.hasNext());
                    break;
            }
            inputLine = scanner.nextLine();
        }
    }
}
