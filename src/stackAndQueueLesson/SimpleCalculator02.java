package stackAndQueueLesson;

import java.util.*;

public class SimpleCalculator02 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split(" ");
        ArrayDeque<String> calculatorStack = new ArrayDeque<>();
        List<String> inputList = new ArrayList<>();
        Collections.addAll(calculatorStack, inputArr);

        while (calculatorStack.size() > 1){
            int firstNum = Integer.parseInt(calculatorStack.pop());
            String operations = calculatorStack.pop();
            int secondNum = Integer.parseInt(calculatorStack.pop());

            switch (operations){
                case "+" :
                    calculatorStack.push("" + (firstNum + secondNum));
                    break;
                case "-" :
                    calculatorStack.push("" + (firstNum - secondNum));
                    break;
            }
        }
        System.out.println(calculatorStack.pop());
    }
}
