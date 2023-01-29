package functionalProgramming_Lesson;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class _05_FilterByAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, Integer> peopleMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] lineArr = scanner.nextLine().split(", ");
            peopleMap.put(lineArr[0], Integer.parseInt(lineArr[1]));
        }

        String condition = scanner.nextLine();
        int ageCondition = Integer.parseInt(scanner.nextLine());
        String format = scanner.nextLine();

        Predicate<Integer> filter = getPredicate(condition, ageCondition);
        Consumer<Map.Entry<String, Integer>> print = printByFilter(format);

        peopleMap.entrySet().stream()
                .filter(entry -> filter.test(entry.getValue()))
                .forEach(entry -> print.accept(entry));
    }

    private static Predicate<Integer> getPredicate(String condition, int age) {
        if (condition.equals("younger")) {
            return a -> a <= age;
        } else if (condition.equals("older")) {
            return a -> a >= age;
        }
        return null;
    }
    private static Consumer<Map.Entry<String, Integer>> printByFilter (String format){
        if(format.equals("age")){
            return e -> System.out.println(e.getValue());
        } else if (format.equals("name")){
            return e -> System.out.println(e.getKey());
        } else if (format.equals("name age")){
            return e -> System.out.printf("%s - %d%n", e.getKey(),e.getValue());
        }
        return null;
    }
}





