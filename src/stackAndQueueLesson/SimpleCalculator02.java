package stackAndQueueLesson;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleCalculator02 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ArrayDeque<Integer> calculatorStack = new ArrayDeque<>();

        int result = 0;

        for (int i = 0; i < input.length() ; i++) {
            char currentSymbol = input.charAt(i);

            if (currentSymbol == '+' ){
                result = calculatorStack.pop() + calculatorStack.pop();
                calculatorStack.push(result);
            } else if (currentSymbol == '-'){
                result = calculatorStack.pop() - calculatorStack.pop();
                calculatorStack.push(result);
            } else {
                int num = Integer.parseInt(String.valueOf(currentSymbol));
                calculatorStack.push(num);
            }
            if (calculatorStack.size() == 1){
                System.out.println(calculatorStack.pop());
            }
        }
    }
}
