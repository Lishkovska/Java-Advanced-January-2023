package stackAndQueueExercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedBrackets05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String parentheses = scanner.nextLine();
        boolean isBalanced = true;
        ArrayDeque<String> bracketsStack = new ArrayDeque<>();

        if (parentheses.length() % 2 != 0) {
            isBalanced = false;
        } else {

            for (int i = 0; i < parentheses.length(); i++) {

                if (parentheses.charAt(i) == '{' || parentheses.charAt(i) == '('
                        || parentheses.charAt(i) == '[') {
                    bracketsStack.push(String.valueOf(parentheses.charAt(i)));
                } else {

                    if (String.valueOf(parentheses.charAt(i)).equals(")") &&
                            !bracketsStack.pop().equals("(")) {
                        isBalanced = false;
                        break;
                    } else if (String.valueOf(parentheses.charAt(i)).equals("]")
                            && !bracketsStack.pop().equals("[")) {
                        isBalanced = false;
                        break;
                    } else if (String.valueOf(parentheses.charAt(i)).equals("}") &&
                            !bracketsStack.pop().equals("{")) {
                        isBalanced = false;
                        break;
                    }
                }
            }
        }
        if (isBalanced) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
