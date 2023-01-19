package setsAndMapsAdvancedLesson;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _04_CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numsArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble).toArray();

        Map<Double, Integer> countMap = new LinkedHashMap<>();
        for (double currentNum : numsArr) {
            if(countMap.containsKey(currentNum)){
                countMap.put(currentNum, countMap.get(currentNum) + 1);
            } else {
                countMap.put(currentNum, 1);
            }
        }
        for (Map.Entry<Double, Integer> entry : countMap.entrySet()) {
            System.out.printf("%.1f -> %d%n",entry.getKey(),entry.getValue());
        }


    }
}
