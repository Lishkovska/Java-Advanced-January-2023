package iteratorsComparators.CollectionExersice_02;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();
        ListyIterator listyIterator = null;

        while (!inputLine.equals("END")) {

            String[] dataParts = inputLine.split("\\s+");
            String command = dataParts[0];

            switch (command) {
                case "Create":
                    if (dataParts.length > 1) {
                        String[] elementArray = Arrays.copyOfRange(dataParts, 1, dataParts.length);
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
                case "PrintAll":
                    listyIterator.printAll();
                    break;
            }
            inputLine = scanner.nextLine();
        }
    }
}
