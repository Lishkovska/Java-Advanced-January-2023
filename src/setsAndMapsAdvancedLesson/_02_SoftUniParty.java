package setsAndMapsAdvancedLesson;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class _02_SoftUniParty{
        public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String firstCommand = scanner.nextLine();
    Set<String> guestSet = new TreeSet<>();

    while (!firstCommand.equals("PARTY")){
        guestSet.add(firstCommand);
        firstCommand = scanner.nextLine();
    }

    String secondCommand = scanner.nextLine();

    while (!secondCommand.equals("END")){
        guestSet.remove(secondCommand);

        secondCommand = scanner.nextLine();
    }

    System.out.println(guestSet.size());
            for (String guest : guestSet) {
                System.out.println(guest);
            }

        }
}
