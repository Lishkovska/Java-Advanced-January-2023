package stackAndQueueLesson;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBrackets04 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ArrayDeque<Integer> bracketsStack = new ArrayDeque<>();

        for (int i = 0; i < input.length() ; i++) {
            char symbol = input.charAt(i);
            if (symbol == '('){
                bracketsStack.push(i);
            } else if (symbol == ')'){
                int startIndex = bracketsStack.pop();
                String subString = input.substring(startIndex, i + 1);
                System.out.println(subString);
            }
        }
    }
}
