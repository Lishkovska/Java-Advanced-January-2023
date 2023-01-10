package stackAndQueueLesson;

import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinary03 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int decimal = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> binaryStack = new ArrayDeque<>();

        if (decimal == 0){
            System.out.println("0");
        } else {
            while (decimal != 0){
                binaryStack.push(decimal % 2);
                decimal = decimal / 2 ;
        }
            for (int binary : binaryStack){
                System.out.print(binaryStack.pop());
            }
        }

    }
}
