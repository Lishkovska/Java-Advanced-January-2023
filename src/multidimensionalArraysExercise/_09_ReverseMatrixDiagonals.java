package multidimensionalArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class _09_ReverseMatrixDiagonals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dimensions = scanner.nextLine();
        int rows = Integer.parseInt(dimensions.split("\\s+")[0]);
        int cols = Integer.parseInt(dimensions.split("\\s+")[1]);

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        for (int row = rows - 1; row >= 0 ; row--) {
            for (int col = cols - 1; col >= 0 ; col--) {
                if (row == col){
                    System.out.print(matrix[row][col] + " ");
                }
            }
            System.out.println();
        }



    }
}
