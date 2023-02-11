package iteratorsComparators.ComparingObjects_exercise_05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();

        List<Person> personList = new ArrayList<>();
        while (!inputLine.equals("END")) {
            String[] personInfo = inputLine.split("\\s+");
            Person person = new Person(personInfo[0], Integer.parseInt(personInfo[1]), personInfo[2]);
            personList.add(person);
            inputLine = scanner.nextLine();
        }
        int indexVIP = Integer.parseInt(scanner.nextLine());
        int counterForSame = 0;
        int counterForDifferent = 0;
        Person personToCompare = personList.get(indexVIP - 1);

        for (Person person : personList) {
            if (person.compareTo(personToCompare) == 0) {
                counterForSame++;
            }else {
                counterForDifferent++;
            }
        }
        if (counterForSame == 1) {
            System.out.println("No matches");
        }else {
            System.out.print(counterForSame+" "+counterForDifferent+" "+ personList.size());
        }
    }
}
