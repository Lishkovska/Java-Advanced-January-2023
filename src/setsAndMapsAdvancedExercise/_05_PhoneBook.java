package setsAndMapsAdvancedExercise;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class _05_PhoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        LinkedHashMap<String, String> phoneBookMap = new LinkedHashMap<>();

        while (!input.equals("search")){
            String name = input.split("-")[0];
            String number = input.split("-")[1];

            if(!phoneBookMap.containsKey(name)){
                phoneBookMap.put(name, number);
            } else {
                phoneBookMap.put(name, number);
            }
            input = scanner.nextLine();
        }

        input = scanner.nextLine();

        while (!input.equals("stop")){

            if(phoneBookMap.containsKey(input)){
                System.out.printf("%s -> %s%n",input, phoneBookMap.get(input));
            } else {
                System.out.printf("Contact %s does not exist.%n", input);
            }
            input = scanner.nextLine();
        }
    }
}
