package multidimensionalArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class _05_MatrixShuffuling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dimensions = scanner.nextLine();

        int rows = Integer.parseInt(dimensions.split("\\s+")[0]);
        int cols = Integer.parseInt(dimensions.split("\\s+")[1]);

        String[][] matrix = new String[rows][cols];

        for (int i = 0; i < rows; i++) {
            String[] arr = scanner.nextLine().split(" ");

            matrix[i] = arr;
        }
        String[] commandArr = scanner.nextLine().split(" ");

        while (!commandArr[0].equals("END")) {
            boolean isValidCommand = true;
            if (commandArr.length == 5) {
                String command = commandArr[0];
                int row1 = Integer.parseInt(commandArr[1]);
                int col1 = Integer.parseInt(commandArr[2]);
                int row2 = Integer.parseInt(commandArr[3]);
                int col2 = Integer.parseInt(commandArr[4]);
                if (isValidIndexRow(row1, rows) && isValidIndexRow(row2, rows)
                        && isValidIndexCols(col1, cols) && isValidIndexCols(col2, cols)
                        && command.equals("swap")) {
                    String oldElement = matrix[row1][col1];
                    String newElement = matrix[row2][col2];
                    matrix[row1][col1] = newElement;
                    matrix[row2][col2] = oldElement;
                    printMatrix(matrix);
                } else {
                    isValidCommand = false;
                }
            } else {
                isValidCommand = false;
            }
                if (!isValidCommand) {
                    System.out.println("Invalid input!");
                }
            commandArr = scanner.nextLine().split(" ");
        }
            System.out.println();

        }
        private static boolean isValidIndexRow (int index, int row){
        return  (index >= 0 && index < row);
        }

        private static boolean isValidIndexCols(int index, int col){
        return  (index >= 0 && index < col);
        }

    private static void printMatrix(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

