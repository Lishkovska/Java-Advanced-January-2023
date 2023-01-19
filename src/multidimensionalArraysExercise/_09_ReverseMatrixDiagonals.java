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
        int row = rows - 1;
        int col = cols - 1;

        while (row != -1){
            int r = row;
            int c = col;
            while (c < cols && r >= 0){
                System.out.print(matrix[r--][c++] + " ");
            }
            System.out.println();
            col--;
            if(col == -1){
                col = 0;
                row--;
            }
        }
    }

    private static boolean isInbounds(int row, int col, int [][] matrix) {
        return row < 0 || col < 0 || row > matrix.length - 1 || col > matrix[0].length - 1;
    }
}
