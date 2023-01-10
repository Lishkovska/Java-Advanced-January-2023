package stackAndQueueExercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedBrackets05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ArrayDeque<Character> queueBrackets = new ArrayDeque<>();

        boolean isBalanced = true;
        for (int i = 0; i < input.length(); i++) {
            char currentBracket = input.charAt(i);
            if (currentBracket == '(' || currentBracket == '{' || currentBracket == '[' ){
                queueBrackets.push(currentBracket);
            } else {
                char lastOpeningBrackets = queueBrackets.pop();
                if ( currentBracket == ')' && lastOpeningBrackets != '('){
                    isBalanced = false;
                    break;
                } else if (currentBracket == '}' && lastOpeningBrackets != '{'){
                    isBalanced = false;
                    break;
                } else if (currentBracket == ']' && lastOpeningBrackets != '['){
                    isBalanced = false;
                    break;
                }
            }
        }
        if (isBalanced){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
