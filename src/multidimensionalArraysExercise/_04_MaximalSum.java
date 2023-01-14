package multidimensionalArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class _04_MaximalSum {
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
        int sum = Integer.MIN_VALUE;
        int maxSumLeftRow = 0;
        int maxSumLeftCol = 0;

        for (int i = 0; i < matrix.length -2; i++) {
            for (int j = 0; j < matrix[i].length -2; j++) {
                int currentSum = matrix[i][j] + matrix[i][j + 1] + matrix[i][j + 2]
                        + matrix[i + 1][j] + matrix[i + 1][j + 1] + matrix[i + 1][j + 2]
                       + matrix[i + 2][j] + matrix[i + 2][j + 1] + matrix[i + 2][j + 2];

                if (currentSum > sum){
                    sum = currentSum;
                    maxSumLeftRow = i;
                    maxSumLeftCol = j;
                }
            }
        }
        System.out.printf("Sum = %d%n", sum);
        System.out.println(matrix[maxSumLeftRow][maxSumLeftCol] + " " +
                matrix[maxSumLeftRow][maxSumLeftCol + 1] + " "
        + matrix[maxSumLeftRow][maxSumLeftCol + 2]);
        System.out.println(matrix[maxSumLeftRow + 1][maxSumLeftCol] + " "
        + matrix[maxSumLeftRow + 1][maxSumLeftCol + 1] + " "
        + matrix[maxSumLeftRow + 1][maxSumLeftCol + 2]);
        System.out.println(matrix[maxSumLeftRow + 2][maxSumLeftCol] + " "
        + matrix[maxSumLeftRow + 2][maxSumLeftCol + 1] + " "
        + matrix[maxSumLeftRow + 2][maxSumLeftCol + 2]);

    }
}
