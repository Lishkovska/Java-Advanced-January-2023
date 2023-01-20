package setsAndMapsAdvancedLesson;

import java.util.*;

public class _05_AverageStudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        TreeMap<String, List<Double>> studentsMap = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String lineInput = scanner.nextLine();
            String name = lineInput.split(" ")[0];
            double grade = Double.parseDouble(lineInput.split(" ")[1]);
            studentsMap.putIfAbsent(name, new ArrayList<>());
            studentsMap.get(name).add(grade);
        }
        for (Map.Entry<String, List<Double>> entry : studentsMap.entrySet()) {

            System.out.print(entry.getKey() + " -> ");
            double sumOfGrades = 0;
            for (Double grade : entry.getValue()) {
                System.out.printf("%.2f ", grade);
                sumOfGrades += grade;

            }
            System.out.printf("(avg: %.2f)%n", sumOfGrades / entry.getValue().size());
        }
    }
}
