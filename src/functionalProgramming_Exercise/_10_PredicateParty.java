package functionalProgramming_Exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class _10_PredicateParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> guestNameList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("Party!")) {

            Predicate<String> condition = getListOfGuest(command);
            String action = command.split("\\s+")[0];

            if (action.equals("Remove")) {
                List<String> listToRemove = guestNameList.stream().filter(condition).
                        collect(Collectors.toList());
                guestNameList.removeAll(listToRemove);

            } else if (action.equals("Double")) {
                List<String> listToAdd = guestNameList.stream().filter(condition)
                        .collect(Collectors.toList());
                guestNameList.addAll(listToAdd);
            }
            command = scanner.nextLine();
        }
        if (guestNameList.isEmpty()) {
            System.out.println("Nobody is going to the party!");
        } else {
            Collections.sort(guestNameList);
            for (int i = 0; i < guestNameList.size(); i++) {
                if (i < guestNameList.size() - 1) {
                    System.out.print(guestNameList.get(i) + ", ");
                } else {
                    System.out.print(guestNameList.get(i) + " are going to the party!");
                }
            }
        }
    }

    private static Predicate<String> getListOfGuest(String command) {
        String criteria = command.split("\\s+")[2];
        if ("StartsWith".equals(command.split("\\s+")[1])) {
            return s -> s.startsWith(criteria);
        } else if ("Length".equals(command.split("\\s+")[1])) {
            return s -> s.length() == Integer.parseInt(criteria);
        } else if ("EndsWith".equals(command.split("\\s+")[1])) {
            return s -> s.endsWith(criteria);
        }
        throw new IllegalArgumentException("Unknown condition " + command);

    }
}