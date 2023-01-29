package functionalProgramming_Lesson;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Predicate;

public class _03_CountUpperCaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputText = scanner.nextLine().split(" ");
        Map<String, Integer> countWordsMap = new LinkedHashMap<>();

        Predicate<String> isUpperCaseWord = word -> {
            return Character.isUpperCase(word.charAt(0));
        };

        for (int i = 0; i < inputText.length; i++) {
            String currentWord = inputText[i];
            if(isUpperCaseWord.test(currentWord)){
                countWordsMap.put(currentWord, 1);
            }
        }
        System.out.println(countWordsMap.size());
        countWordsMap.keySet().forEach(System.out::println);
    }
}
