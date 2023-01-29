package functionalProgramming_Lesson;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class _06_FindEvenOrOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int startNum = Integer.parseInt(input.split(" ")[0]);
        int endNum = Integer.parseInt(input.split(" ")[1]);
        String command = scanner.nextLine();

        Predicate<Integer> filterEvenOrOdd = getPredicate(command, startNum, endNum);




    }
    private static Predicate<Integer> getPredicate(String command, int start, int end){
        List<Integer> list = new ArrayList<>();
        if(command.equals("odd")){
            for (int i = start; i <= end ; i++) {
               list.stream().filter(e -> e % 2 != 0);
            }
            
        }
    }
}
