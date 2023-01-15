package multidimensionalArraysExercise;

import java.util.Scanner;

public class _01_FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split(", ");
        int size = Integer.parseInt(inputArr[0]);
        String pattern = inputArr[1];

        int[][] matrix = new int[size][size];

        int startNum = 1;

        if (pattern.equals("A")){
            getPatternA(size, matrix, startNum);
            printMatrix(size, matrix);
        } else if (pattern.equals("B")){
            getPatternB(size, matrix, startNum);
            printMatrix(size, matrix);
        }
    }

    private static void printMatrix(int size, int[][] matrix) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
               System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void getPatternB(int size, int[][] matrix, int startNum) {
        for (int col = 0; col < size; col++) {
            if (col % 2 == 0){
                for (int row = 0; row < size; row++) {
                    matrix[row][col] = startNum;
                    startNum++ ;
                }
            } else {
                for (int row = size - 1; row >= 0; row--) {
                    matrix[row][col] = startNum;
                    startNum++;
                }
            }
        }
    }

    private static void getPatternA(int size, int[][] matrix, int startNum) {
        for (int col = 0; col < size; col++) {
            for (int row = 0; row < size; row ++) {
                matrix[row][col] = startNum;
                startNum++ ;
            }
        }
    }
}
