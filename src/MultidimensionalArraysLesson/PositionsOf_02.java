package MultidimensionalArraysLesson;

import java.util.Arrays;
import java.util.Scanner;

public class PositionsOf_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int rows = dimensions[0];
        int cols = dimensions[1];

        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt).toArray();

            matrix[i] = arr;
            }

        int searchingNumber = Integer.parseInt(scanner.nextLine());
        boolean isFound = false;
        for(int row = 0 ; row < matrix.length ; row++){
            for (int col = 0; col < matrix[row].length; col++) {
                int currentNum = matrix[row][col];
                if (currentNum == searchingNumber){
                    isFound = true;
                    System.out.println(row + " " + col);
                }
            }
        }
        if (!isFound){
            System.out.println("not found");
        }
      }
    }
