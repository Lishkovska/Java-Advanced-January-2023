package setsAndMapsAdvancedExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _06_FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, String> contactMap = new LinkedHashMap<>();

        while (!input.equals("stop")){
            String name = input;
            String email = scanner.nextLine();
            if (!email.endsWith(".us") && !email.endsWith(".uk") && !email.endsWith(".com")){
                contactMap.put(name, email);
            }
            input = scanner.nextLine();
        }

        for (Map.Entry<String, String> e : contactMap.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}
